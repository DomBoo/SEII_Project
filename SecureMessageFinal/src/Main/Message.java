package Main;

/**
 * Handelt den Umgang mit den Nachrichtendaten
 * 
 * @author AllSafe
 */
public class Message {
	/**
	 * Normale/Entschluesselte Nachricht
	 */
	private String msg;
	/**
	 * Verschluesselte Nachricht
	 */
	private String encryptedMsg;
	/**
	 * Laenge der Nachricht
	 */
	private int length;
	
	public Message() {
		this("");
	}
	
	public Message(String msg) {
		this.msg = msg;
	}
	
	/**
	 * Setzt die Nachricht
	 * @param text
	 */
	public void setText(String text) {
		msg = text;
	}
	
	/**
	 * Gibt die Nachricht zurueck
	 * @return
	 */
	public String getText() {
		return msg;
	}
	
	/**
	 * Setzt die verschluesselte Nachricht
	 * @param text
	 */
	public void setEncryptedText(String text) {
		encryptedMsg = text;
	}
	
	/**
	 * Gibt die verschluesselte Nachricht zurueck
	 * @return
	 */
	public String getEncryptedText() {
		return encryptedMsg;
	}
	
	/**
	 * Gibt die Laenge der Nachricht zurueck
	 * @return
	 */
	public int getLength() {
		return length;
	}
}
