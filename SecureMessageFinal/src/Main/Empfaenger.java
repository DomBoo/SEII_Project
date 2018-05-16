package Main;

/**
 * Handelt den Umgang mit den Empfaengerdaten
 * 
 * @author AllSafe
 */

public class Empfaenger {
	/**
	 * Name des Empfaengers
	 */
	protected static String empfaenger;
	/**
	 * Key des Empfaengers
	 */
	protected static String empfaengerKey;
	
	/**
	 * Gibt den Namen des Empfaengers zurueck
	 * 
	 * @return 
	 */
	public static String getEmpfaenger() {
		return empfaenger;
	}
	
	
	/**
	 * Gibt den Key des Empfaengers zurueck
	 * 
	 * @return
	 */
	public static String getEmpfaengerKey() {
		return empfaengerKey;
	}
	
	/**
	 * Setzt den Namen des Empfaengers 
	 * 
	 * @param empfaenger Name des Empfaengers
	 */
	public static void setEmpfaenger(String empfaenger) {
		Empfaenger.empfaenger = empfaenger;
	}
}
