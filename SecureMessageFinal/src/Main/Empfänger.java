package Main;

public class Empfänger {
	protected static String empfänger;
	protected static String empfängerKey;
	
	public static String getEmpfänger() {
		return empfänger;
	}
	
	public static String getEmpfängerKey() {
		return empfängerKey;
	}
	
	public static void setEmpfänger(String empfänger) {
		Empfänger.empfänger = empfänger;
	}
	
	public static void setEmpfängerKey(String key) {
		empfängerKey = key;
	}
}
