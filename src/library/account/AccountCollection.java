/**
 * Bridge class between database and software for the Accounts class
 * @author Benny Pena
 * @author Jeffrey Godoy
 * @author Junaid Farooq 
 * @version 1.0
 */
import java.sql.*;
import javax.sql.*;
import java.util.ArrayList;

public class AccountCollection {
	//database url ( Changes for Final Product)
	private static String url = "jdbc:mysql://localhost:3306/localschema";
	
	//database username to determine data privileges
	private static String username = "admin"; 
	
	//password to that username
	private static String password = "admin";

	
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
		try {
			//get connection to database
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//Statement creation to do operations on database
			Statement resultStatement = connection.createStatement();
			
			//Type cast object to a Patron account
			PatronAccount p = (PatronAccount) patron;
			
			//Execute a string with the MySQL instructions or statements
			resultStatement.execute("insert into patron "+
									"(AID, FName, LName, PNum, Email, Balance) "+
									"values " + "('"+p.getId()
									+"', '"+p.getFirstName()+"', '"+p.getLastName()+
									"', '"+p.getPhoneNumber()+"', '"+p.getEmail()+"', '"+p.getAccountBalance()+"')");
			
			//Close the connection so leakage of resources
			connection.close();
		
		} catch (SQLException e) {
			//For debuging purposes (final product should not have stack trace
			e.printStackTrace();
			// return failed because it did not execute command
			return FAILED;
		}
		//if everything went well the insertion went well
		return SUCCESS;
	}
	/**
	 * Insert Staff Account
	 * 
	 * @param  staff  StaffAccount object
	 * @return  returns either success or failed value.
	 */
	public static boolean insertStaff(Account staff) {
		try {
			//get connection to database
			Connection connection = DriverManager.getConnection(url,username,password);
			
			String sql =("insert into staff (AID, FName, LName, PNum, Type) values (?, ?, ?, ?, ?)");
			
			//Statement creation to do operations on database
			PreparedStatement resultStatement = connection.prepareStatement(sql);
			
			//Type cast object to a Staff account
			StaffAccount s = (StaffAccount) staff;
			
			resultStatement.setString(1,s.getId());
			resultStatement.setString(2,s.getFirstName());
			resultStatement.setString(3,s.getLastName());
			resultStatement.setString(4,s.getPhoneNumber());
			resultStatement.setString(5,String.valueOf(s.getAccountType()));
			
			//Execute a string with the MySQL instructions or statements
			resultStatement.execute();
			
			//Close the connection so leakage of resources
			resultStatement.close();
			connection.close();
		
		} catch (SQLException e) {
			//For debuging purposes (final product should not have stack trace
			e.printStackTrace();
			// return failed because it did not execute command
			return FAILED;
		}
		return SUCCESS;
	}

	/**
	 * Update Patron Account
	 * @param  patron  PatronAccount object
	 * @return  returns either success or failed value.
	 */
	public static boolean updatePatron(PatronAccount patron) {
		try {
			//get connection to database
			Connection connection = DriverManager.getConnection(url,username,password);
			//
			String sql = ("UPDATE patron SET FName = ?, LName = ?, PNum = ?, Email = ?, Balance = ?, Address = ? WHERE AID = ?");
					
			//Statement creation to do operations on database
			PreparedStatement resultStatement = connection.prepareStatement(sql);
			
			//Type cast object to a Patron account
			PatronAccount p = patron;
			
			resultStatement.setString(1,p.getFirstName());
			resultStatement.setString(2,p.getLastName());
			resultStatement.setString(3,p.getPhoneNumber());
			resultStatement.setString(4,p.getEmail());
			resultStatement.setDouble(5,p.getAccountBalance());
			resultStatement.setString(6,p.getAddress());
			resultStatement.setString(7,p.getId());
			
			resultStatement.executeUpdate();
			
			//Close the connection so leakage of resources
			resultStatement.close();
			connection.close();
		
		} catch (SQLException e) {
			//For debuging purposes (final product should not have stack trace
			e.printStackTrace();
			// return failed because it did not execute command
			return FAILED;
		}
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
	 public static ArrayList<StaffAccount> searchStaffByTel(String telNum) {
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
	 public static ArrayList<StaffAccount> searchStaffByLName(String first) {
		ArrayList<StaffAccount> resultList = new ArrayList<StaffAccount>();
	 	return resultList;
	 }
	 
}
