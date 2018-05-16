package Verschluesselung;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.io.*;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {
	public static SecretKeySpec keygen(String keyStr) throws Exception{
		byte[] key = (keyStr).getBytes("UTF-8");
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		key = sha.digest(key);
		key = Arrays.copyOf(key, 16); 
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
		return secretKeySpec;
	}
	
	public static String encrypt(String msg, SecretKeySpec secretKeySpec) throws Exception{
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] encrypted = cipher.doFinal(msg.getBytes());
		Encoder myEncoder = Base64.getEncoder();
	    return myEncoder.encodeToString(encrypted);
	}
	
	public static String decrypt(String msg, SecretKeySpec secretKeySpec) throws Exception{	 
		byte[] crypted = Base64.getDecoder().decode(msg);
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
		byte[] cipherData = cipher.doFinal(crypted);
		return new String(cipherData);
	}
	
	public static String getKey(SecretKeySpec key) {
		return Base64.getEncoder().encodeToString(key.getEncoded());
	}
	
	public static void saveKey(String name, SecretKeySpec key) throws Exception {
		File dir = new File("keys/keys");
		Scanner scan = new Scanner(dir);
		
		try { 
			FileWriter fos = new FileWriter("keys/keys", true);
			BufferedWriter bf = new BufferedWriter(fos);
			PrintWriter pw = new PrintWriter(bf);
			BufferedReader file = new BufferedReader(new FileReader("keys/keys"));
			while(scan.hasNext()) {
				String line = scan.nextLine().toString();
				if (line.contains(name))
				{
					String tmp = "";
					String line1;
					while((line1 = file.readLine()) != null)
					{
						tmp = tmp + line1 + "\n";
					}
					tmp = tmp.substring(0, tmp.length()-1);
					System.out.println(tmp);
					tmp = tmp.replace(name + "#" + Crypto.getKey(Crypto.importKey(name)), name + "#" + Base64.getEncoder().encodeToString(key.getEncoded()));
					FileOutputStream fileOut = new FileOutputStream("keys/keys");
					fileOut.write(tmp.getBytes());
					fileOut.close();
					return;
				}
			}
			
			file.close();
			scan.close();
			pw.println(name + "#" + Base64.getEncoder().encodeToString(key.getEncoded()));
			pw.close();	
			}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}
	
	public static SecretKeySpec importKey(String name) throws Exception {
		File f = new File("keys/keys");
		Scanner scan = new Scanner(f);
		String key = null;
		byte[] keydec = null;
		
		try
        {
          while(scan.hasNext()){
              String line = scan.nextLine().toString();
              if(line.contains(name)){
            	  key = line;
              } 
         }
        key = key.substring(key.indexOf("#")+1, key.length());
        scan.close();
        keydec = Base64.getDecoder().decode(key.getBytes());
        }
        catch(Exception fra)
        {
          System.out.println(fra);
        }
		System.out.println("Beschnittender Sring: " + key);
        return new SecretKeySpec(keydec, 0, keydec.length, "AES");
	}
	
	public static void main(String args[]) throws Exception {
		String msg = "Ich bin eine geheime Nachricht";
		String keyst = "76";
		String msgver;
		SecretKeySpec key = Crypto.keygen(keyst);
		
		System.out.println(msg);
		System.out.println(Crypto.getKey(key));
		
		msgver = Crypto.encrypt(msg, key);
		System.out.println(msgver);
		Crypto.saveKey("Helmut" , key);
		
		SecretKeySpec keyim = Crypto.importKey("Helga");
		System.out.println(Crypto.getKey(keyim));
		//System.out.println(Crypto.decrypt(msgver, keyim));
	}
}
