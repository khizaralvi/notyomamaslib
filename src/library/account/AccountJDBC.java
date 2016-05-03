import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;

public class AccountJDBC {
	private String url = "jdbc:mysql://localhost:3306/";
	private String username = "admin";
	private String password = "admin";
	private Connection connection = null;
	private String patron = "patron";
	private String staff = "staff";
	
	/**
	 * Value when the an operation is successful
	 */
	public static final boolean SUCCESS = true;
	/**
	 * Value when the operation fails
	 */
	public static final boolean FAILED = false;

	/**
	 * Insert Patron Account
	 * 
	 * @param  patron  PatronAccount object
	 * @return  returns either success or failed value.
	 */
	public static boolean insertPatron(Account patron){
	    return SUCCESS;
	}
	/**
	 * Insert Staff Account
	 * 
	 * @param  staff  StaffAccount object
	 * @return  returns either success or failed value.
	 */
	public static boolean insertStaff(Account staff) {
	    return SUCCESS;
	}

	/**
	 * Update Patron Account
	 * @param  patron  PatronAccount object
	 * @return  returns either success or failed value.
	 */
	public static boolean updatePatron(Account patron) {
	    return SUCCESS;
	}

	/**
	 * Delete Patron Account
	 * @param  key  PatronAccount id
	 * @return  returns either success or failed value.
	 */
	public static boolean deletePatron(String key) {
	    return SUCCESS;
	}

	/**
	 * Delete Staff Account
	 * @param  key  String object
	 * @return  returns either success or failed value.
	 */
	public static boolean deleteStaff(String key) {
	    return SUCCESS;
	}

	/**
	 *search Patron Account by ID number
	 * @param  key  The account ID (library card number)
	 * @return  resultAccount  PatronAccount object.
	 */
	 public static PatronAccount searchPatronByID(String key) {
		PatronAccount resultAccount = null; 
	 	return resultAccount;
	 }
	 
	/**
	 * search Staff Account by ID number
	 * @param  telNum  Phone number associated with the account
	 * @return  resultAccount  ArrayList of StaffAccount object.
	 */
	 public static StaffAccount searchStaffByID(String telNum) {
		StaffAccount resultAccount = null;
	 	return resultAccount;
	 }
	 
	/**
	 * search Patron Account by phone number
	 * @param  telNum  Phone number associated with the account
	 * @return  resultList  ArrayList of PatronAccount object.
	 */
	 public static ArrayList<PatronAccount> searchPatronByTel(String telNum) {
		 ArrayList<PatronAccount> resultList = new ArrayList<PatronAccount>();
		 return resultList;
	 }
	 
	/**
	 * search Staff Account by phone number
	 * @param  telNum  Phone number associated with the account
	 * @return  resultList  ArrayList of StaffAccount object.
	 */
	 public static ArrayList<StaffAccount> searchSraffByTel(String telNum) {
	 	ArrayList<StaffAccount> resultList = new ArrayList<StaffAccount>();
		 return resultList;
	 }

	/**
	 * search Patron Account by Last Name
	 * @param  last  The last name associated with the account
	 * @return  resultList  ArrayList of PatronAccount object.
	 */
	 public static ArrayList<PatronAccount> searchPatronByLName(String last) {
		ArrayList<PatronAccount> resultList = new ArrayList<PatronAccount>();
	 	return resultList;
	 }
	 
	/**
	 * search Staff Account by Last Name
	 * @param  last  The first name associated with the account
	 * @return  resultList  ArrayList of StaffAccount object.
	 */
	 public static ArrayList<StaffAccount> searchSraffByLName(String first) {
		ArrayList<StaffAccount> resultList = new ArrayList<StaffAccount>();
	 	return resultList;
	 }
}
