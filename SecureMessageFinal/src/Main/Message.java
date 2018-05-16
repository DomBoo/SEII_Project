package Main;

public class Message {
	private String msg;
	private String encryptedMsg;
	private int length;
	
	public Message() {
		this("");
	}
	
	public Message(String msg) {
		this.msg = msg;
	}
	
	public void setText(String text) {
		msg = text;
	}
	
	public String getText() {
		return msg;
	}
	
	public void setEncryptedText(String text) {
		encryptedMsg = text;
	}
	
	public String getEncryptedText() {
		return encryptedMsg;
	}
	
	public int getLength() {
		return length;
	}
}
