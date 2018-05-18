package Main;

/**
 *  In der Klasse Message werden die Klartext Nachricht und die verschluesselte Nachricht, sowie 
 *  Methoden zum Umgang mit den Nachrichten, bereitgestellt.
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
	
	/**
	 * Initialisiert die Nachricht mit ""
	 */
	public Message() {
		this("");
	}
	
	/**
	 * Initialisiert die Nachricht mit dem Parameter msg
	 * 
	 * @param msg Klartext Nachricht 
	 */
	public Message(String msg) {
		this.msg = msg;
	}
	
	/**
	 * Setzt die Nachricht
	 * @param text Klartext Nachricht
	 */
	public void setText(String text) {
		msg = text;
	}
	
	/**
	 * Gibt die Nachricht zurueck
	 * @return Klartext Nachricht
	 */
	public String getText() {
		return msg;
	}
	
	/**
	 * Setzt die verschluesselte Nachricht
	 * @param text verschluesselte Nachricht
	 */
	public void setEncryptedText(String text) {
		encryptedMsg = text;
	}
	
	/**
	 * Gibt die verschluesselte Nachricht zurueck
	 * @return verschluesselte Nachricht
	 */
	public String getEncryptedText() {
		return encryptedMsg;
	}
	
	/**
	 * Gibt die Laenge der Nachricht zurueck
	 * @return Laenge der eingegebenen Nachricht
	 */
	public int getLength() {
		return length;
	}
}
