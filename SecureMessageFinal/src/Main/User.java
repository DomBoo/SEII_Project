package Main;

/**
 * Handelt den Umgang mit den Userdaten
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
	 * @return
	 */
	public static String getName() {
		return name;
	}
	
	/**
	 * setzt den Namen des Users
	 * @param name Name des Users
	 */
	public static void setName(String name) {
		User.name = name;
	}
}
 