package Main;

/**
 * Stellt die Klasse fuer die Benutzerdaten dar
 * 
 * @author AllSafe
 */
public class User {
	/**
	 * Name des Users
	 */
	protected static String name;
	/**
	 * Passwort des Users
	 */
	protected static String password;
	
	/**
	 * Gibt den Namen des Users zurueck
	 * @return Name des Users
	 */
	public static String getName() {
		return name;
	}
	
	/**
	 * Setzt den Namen des Users
	 * @param name Name des Users
	 */
	public static void setName(String name) {
		User.name = name;
	}
}
 