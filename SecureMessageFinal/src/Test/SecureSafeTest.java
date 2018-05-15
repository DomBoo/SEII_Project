package Test;

import static org.junit.Assert.*;

import javax.crypto.spec.SecretKeySpec;

import org.junit.Before;
import org.junit.Test;

import Main.MessageService;
import Verschlüsselung.Crypto;
import javafx.stage.Stage;

public class SecureSafeTest {

//	@Before
//	public void createWindow() {
//		
//	}
	
	@Test
	public void UserEingabeTest() {
		//assertEquals("Uwe", input.getText());
	}

	@Test
	public void PasswordEingabeTest() {
		//assertEquals("GeheimesPassword", password.getText());
	}
	
	@Test
	public void EncryptTest() throws Exception {
		SecretKeySpec key = Crypto.keygen("Test");
		assertEquals("FhD4cXFFUaQ6AcwOWXmr4ZZZz7npwidmnaOGHm344og=", Crypto.encrypt("Ich bin eine geheime Nachricht", key));
	}
	
	@Test
	public void DecryptTest() throws Exception {
		SecretKeySpec key = Crypto.keygen("Test");
		assertEquals("Ich bin eine geheime Nachricht", Crypto.decrypt("FhD4cXFFUaQ6AcwOWXmr4ZZZz7npwidmnaOGHm344og=", key));
	}
	
	@Test
	public void TextFieldLengthTest() {
		
	}
	
	@Test
	public void PublicKeyEingabeTest() {
		
	}
	
	@Test
	public void PrivateKeyEingabeTest() {
		
	}
	
	@Test
	public void ShowKeysTest() throws Exception {
		SecretKeySpec key = Crypto.keygen("Test");
		assertEquals("Uy6qvZV0iA2/drm4zACDLA==", Crypto.getKey(key));
	}
	
	@Test 
	public void importKeyTest() throws Exception {
		//Key: "Test", Name Helga 
		assertEquals("Uy6qvZV0iA2/drm4zACDLA==", Crypto.getKey(Crypto.importKey("Helga")));
	}
	
	@Test
	public void ClickButtonTest() {
		
	}
}
