package Verschlüsselung;

public class Key {
	private String publicKey;
	private String privateKey;
	
	public String getPublicKey() {
		return publicKey;
	}
	
	public void setPublicKey(String key) throws Exception {
		Crypto.keygen(key);
	}
}
