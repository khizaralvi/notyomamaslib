
public class LoginManager {
	
	/**
	 * Value when the an operation is successful
	 */
	public static final boolean SUCCESS = true;
	
	/**
	 * Value when the operation fails
	 */
	public static final boolean FAILED = false;
	
	/**
	 * Inserts an account's login credentials
	 * @param associatedAccount
	 * @return Confirmation of action
	 */
	public static boolean insertLogin(Account associatedAccount){
		return true;
	}
	
	/**
	 * Deletes an account's login credentials
	 * @param associatedAccount
	 * @return Confirmation of action
	 */
	public static boolean deleteLogin(Account associatedAccount){
		return true;
	}
	
	/**
	 * Updates an account's login credentials
	 * @param associatedAccount
	 * @param newUser
	 * @param newPass
	 * @return Confirmation of action
	 */
	public static boolean updateLogin(Account associatedAccount, String newUser, String newPass){
		return true;
	}
	
	/**
	 * Returns an array containing the login credentials 
	 * @param associatedAccount
	 * @return {username,password}
	 */
	public static String[] viewLogin(Account associatedAccount){
		return null;
	}
	
}
