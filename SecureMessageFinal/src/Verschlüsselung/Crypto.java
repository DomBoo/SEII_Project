package Verschlüsselung;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.io.*;

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
	
	public static void saveKey(SecretKeySpec key) {
		File dir = new File("keys");
		dir.mkdirs();
		
		try { 
			FileWriter fos = new FileWriter(dir.getAbsoluteFile() + "/keys");
			BufferedWriter bf = new BufferedWriter(fos);
			bf.write(Base64.getEncoder().encodeToString(key.getEncoded()));
			bf.close();	
			}
		catch(IOException e)
		{
			e.printStackTrace();	
		}
	}
	
	public static SecretKeySpec importKey() {
		File f = new File("keys/keys");
		String key;
		byte[] keydec = null;
		
		try
        {
          FileReader fr = new FileReader(f);
          BufferedReader br = new BufferedReader(fr);
          key = br.readLine();
          br.close();
          keydec = Base64.getDecoder().decode(key.getBytes());
        }
        catch(Exception fra)
        {
          System.out.println(fra);
        }
        return new SecretKeySpec(keydec, 0, keydec.length, "AES");
	}
	
	public static void main(String args[]) throws Exception {
		String msg = "Ich bin eine geheime Nachricht";
		String keyst = "Geheimer Key";
		String msgver;
		SecretKeySpec key = Crypto.keygen(keyst);
		
		System.out.println(msg);
		System.out.println(Crypto.getKey(key));
		
		msgver = Crypto.encrypt(msg, key);
		System.out.println(msgver);
		Crypto.saveKey(key);
		
		SecretKeySpec keyim = Crypto.importKey();
		System.out.println(Crypto.getKey(keyim));
		
		System.out.println(Crypto.decrypt(msgver, keyim));
	}
}
