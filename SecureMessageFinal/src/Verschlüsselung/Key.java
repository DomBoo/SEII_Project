package Verschlüsselung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.*;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class Key {
	private PublicKey publicKey;
	private PrivateKey privateKey;
	private static KeyPair key = null;

	public String getPublicKey() {
		return Base64.encode(key.getPublic().getEncoded(),Base64.BASE64DEFAULTLENGTH);
	}
	
	public String getPrivateKey() {
		return Base64.encode(key.getPrivate().getEncoded(),Base64.BASE64DEFAULTLENGTH);
	}
	
	public void keyGen() {
		try { 
			// zufaelligen Key erzeugen
			KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
			keygen.initialize(512);
			key = keygen.genKeyPair();
				 
			// schluessel lesen
			privateKey = key.getPrivate();
			publicKey = key.getPublic();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public byte[] encrypt(String message, PublicKey pk){
		Cipher cipher = null;
		byte[] chiffrat = null;
		try {
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, pk);
			chiffrat = cipher.doFinal(message.getBytes());
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		}
		return chiffrat;
	}
	
	public String decrypt(byte[] chiffrat, PrivateKey sk) {
		byte[] dec = null;
		Cipher cipher = null;
		
		try {
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, sk);
			dec = cipher.doFinal(chiffrat);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return new String(dec);
	}
	
	public void keysEinlesen() {
		File dir = new File("keys");
		dir.mkdirs();
		
		try { 
		// Public Key sichern
		//X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());
		//FileOutputStream fos = new FileOutputStream(dir.getAbsoluteFile() + "/public.key");
		//fos.write(x509EncodedKeySpec.getEncoded());
		//fos.close();
			
			FileWriter fos = new FileWriter(dir.getAbsoluteFile() + "/public.txt");
			BufferedWriter bf = new BufferedWriter(fos);
			bf.write(this.getPublicKey());
			bf.close();	
		
		// Private Key sichern
		//PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKey.getEncoded());
		//fos = new FileOutputStream(dir.getAbsoluteFile() + "/private.key");
		//fos.write(pkcs8EncodedKeySpec.getEncoded());
		//fos.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void keysAuslesen() {
		//+++++++++++++++++++++++++++++++++
		//Private key
		//+++++++++++++++++++++++++++++++++
		File dateiPriK = new File("keys/private.key");

		try {
		//Private Key lesen
		FileInputStream fis = new FileInputStream(dateiPriK);
		byte[] encodedPrivateKey = new byte[(int) dateiPriK.length()];
		fis.read(encodedPrivateKey);
		fis.close();
		    
		//generiere Key
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
		PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);   

		//+++++++++++++++++++++++++++++++++
		//Public key
		//+++++++++++++++++++++++++++++++++
		//Datei
		File dateiPubK = new File("keys/public.key");

		//Public key lesen
		fis = new FileInputStream(dateiPubK);
		byte[] encodedPublicKey = new byte[(int) dateiPubK.length()];
		
		fis.read(encodedPublicKey);
		fis.close();
		    
		//generiere Key
		keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encodedPublicKey);
		PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


















//
//private PublicKey publicKey;
//private PrivateKey privateKey;
//private static KeyPair key = null;
//
//public PublicKey getPublicKey() {
//	return publicKey;
//}
//
//public PrivateKey getPrivateKey() {
//	return privateKey;
//}
//
//public void keyGen() {
//	//final KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
//	//keyGen.initialize(1024);
//	//key = keyGen.generateKeyPair();
//	//publicKey = key.getPublic();
//	//privateKey = key.getPrivate();
//	
//	keysEinlesen();
//	keysAuslesen();
//	
//}
//
//public byte[] encrypt(String message, PublicKey pk){
//	Cipher cipher = null;
//	byte[] chiffrat = null;
//	try {
//		cipher = Cipher.getInstance("RSA");
//		cipher.init(Cipher.ENCRYPT_MODE, pk);
//		chiffrat = cipher.doFinal(message.getBytes());
//	} catch (InvalidKeyException e) {
//		e.printStackTrace();
//	} catch (IllegalBlockSizeException | BadPaddingException e) {
//		e.printStackTrace();
//	} catch (NoSuchAlgorithmException e) {
//		e.printStackTrace();
//	} catch (NoSuchPaddingException e) {
//		e.printStackTrace();
//	}
//	return chiffrat;
//}
//
//public String decrypt(byte[] chiffrat, PrivateKey sk) {
//	byte[] dec = null;
//	Cipher cipher = null;
//	
//	try {
//		cipher = Cipher.getInstance("RSA");
//		cipher.init(Cipher.DECRYPT_MODE, sk);
//		dec = cipher.doFinal(chiffrat);
//	} catch (InvalidKeyException e) {
//		e.printStackTrace();
//	} catch (NoSuchAlgorithmException e) {
//		e.printStackTrace();
//	} catch (NoSuchPaddingException e) {
//		e.printStackTrace();
//	} catch (IllegalBlockSizeException e) {
//		e.printStackTrace();
//	} catch (BadPaddingException e) {
//		e.printStackTrace();
//	}
//	return new String(dec);
//}
//
//public void keysEinlesen() {
//	File dir = new File("keys");
//	dir.mkdirs();
//	
//	try { 
//	// zufaelligen Key erzeugen
//	KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
//	keygen.initialize(1024);
//	KeyPair keyPair = keygen.genKeyPair();
//		 
//	// schluessel lesen
//	PrivateKey privateKey = keyPair.getPrivate();
//	PublicKey publicKey = keyPair.getPublic();
//	 
//	// Public Key sichern
//	X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());
//	FileOutputStream fos = new FileOutputStream(dir.getAbsoluteFile() + "/public.key");
//	fos.write(x509EncodedKeySpec.getEncoded());
//	fos.close();
//	
//	String publicKeyBytes = Base64.encode(keyPair.getPublic().getEncoded(),Base64.BASE64DEFAULTLENGTH);
//	String pubKey = new String(publicKeyBytes);
//	System.out.println("Das ist der KEY: "+pubKey);
//			 
//	// Private Key sichern
//	PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKey.getEncoded());
//	fos = new FileOutputStream(dir.getAbsoluteFile() + "/private.key");
//	fos.write(pkcs8EncodedKeySpec.getEncoded());
//	fos.close();
//	
//	String privateKeyBytes = Base64.encode(keyPair.getPrivate().getEncoded(),Base64.BASE64DEFAULTLENGTH);
//	String privKey = new String(privateKeyBytes);
//	System.out.println("Das ist der KEY: "+privKey);
//	
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
//}
//
//public void keysAuslesen() {
//	//+++++++++++++++++++++++++++++++++
//	//Private key
//	//+++++++++++++++++++++++++++++++++
//	File dateiPriK = new File("keys/private.key");
//
//	try {
//	//Private Key lesen
//	FileInputStream fis = new FileInputStream(dateiPriK);
//	byte[] encodedPrivateKey = new byte[(int) dateiPriK.length()];
//	fis.read(encodedPrivateKey);
//	fis.close();
//	    
//	//generiere Key
//	KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//	PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(encodedPrivateKey);
//	PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);   
//
//	//+++++++++++++++++++++++++++++++++
//	//Public key
//	//+++++++++++++++++++++++++++++++++
//	//Datei
//	File dateiPubK = new File("keys/public.key");
//
//	//Public key lesen
//	fis = new FileInputStream(dateiPubK);
//	byte[] encodedPublicKey = new byte[(int) dateiPubK.length()];
//	
//	fis.read(encodedPublicKey);
//	fis.close();
//	    
//	//generiere Key
//	keyFactory = KeyFactory.getInstance("RSA");
//	X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encodedPublicKey);
//	PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
//}