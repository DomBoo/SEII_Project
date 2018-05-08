package crypto;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {
	public static SecretKeySpec keygen(String keyStr) throws Exception
	{
		byte[] key = (keyStr).getBytes("UTF-8");
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		key = sha.digest(key);
		key = Arrays.copyOf(key, 16); 
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
		return secretKeySpec;
	}
	
	public static String encrypt(String msg, SecretKeySpec secretKeySpec) throws Exception
	{
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
		byte[] encrypted = cipher.doFinal(msg.getBytes());
		Encoder myEncoder = Base64.getEncoder();
	    return myEncoder.encodeToString(encrypted);
	}
	
	public static String decrypt(String msg, SecretKeySpec secretKeySpec) throws Exception
	{	 
		byte[] crypted = Base64.getDecoder().decode(msg);
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
		byte[] cipherData = cipher.doFinal(crypted);
		return new String(cipherData);
	}

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		String en = "Ich bin eine geheime Nachricht";
//		String de;
//		SecretKeySpec key;
//		
//		key = Crypto.keygen("Geheime Nachricht");
//		System.out.println(key.toString());
//		System.out.println(en);
//		en = Crypto.encrypt(en, key);
//		System.out.println(en);
//		
//		de = Crypto.decrypt(en, key);
//		System.out.println(de);
//	}

}
