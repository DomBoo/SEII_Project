package Test;

import static org.junit.Assert.*;

import javax.crypto.spec.SecretKeySpec;

import org.junit.Test;

import Verschluesselung.Key;

public class SecureSafeTest {	
	@Test
	public void EncryptTest() throws Exception {
		SecretKeySpec key = Key.keygen("Test");
		assertEquals("FhD4cXFFUaQ6AcwOWXmr4ZZZz7npwidmnaOGHm344og=", Key.encrypt("Ich bin eine geheime Nachricht", key));
	}
	
	@Test
	public void DecryptTest() throws Exception {
		SecretKeySpec key = Key.keygen("Test");
		assertEquals("Ich bin eine geheime Nachricht", Key.decrypt("FhD4cXFFUaQ6AcwOWXmr4ZZZz7npwidmnaOGHm344og=", key));
	}
	
	@Test
	public void ShowKeysTest() throws Exception {
		SecretKeySpec key = Key.keygen("Test");
		assertEquals("Uy6qvZV0iA2/drm4zACDLA==", Key.getKey(key));
	}
	
	@Test 
	public void importKeyTest() throws Exception {
		//Key: "Test", Name Helga 
		assertEquals("Uy6qvZV0iA2/drm4zACDLA==", Key.getKey(Key.importKey("Helga")));
	}
	
}
