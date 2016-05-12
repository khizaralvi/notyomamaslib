package library.account;

import java.util.ArrayList;
import java.sql.*;
import javax.sql.*;

public class AccountJDBC {
    private String dbUrl = "jdbc:mysql://localhost:3306/patron";
    private String dbUsername = "root";
    private String dbPassword = "admin";
    private Connection myConn = null;

    public AccountJDBC() {
    }
    
    public AccountJDBC(String url, String username, String password) {
        dbUrl = url;
        dbUsername = username;
        dbPassword = password;
    }
    
    //CONNECT
    public void connect() {
       
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }
        catch (Exception exc) {
                exc.printStackTrace();
        }
    }

    //INSERT
    /*
    public int insert(String dbTable, String[] dbFields, String[] dbValues) {
        Stat
        int rowsAffected = 0;
        String mySQL = "";
        
        try {
            mySQL = "INSERT INTO ";
            mySQL += dbTable;
            mySQL += " (";

            for (int i = 0; i < dbFields.length; i++) {
                if (i == dbFields.length - 1)
                    mySQL += dbFields[i] + ")";
                else
                    mySQL += dbFields[i] + ",";
            }
            
            mySQL += " VALUES (";
            
            for (int i = 0; i < dbValues.length; i++) {
                if (i == dbValues.length - 1)
                    mySQL += dbValues[i] + ")";
                else
                    mySQL += dbValues[i] + ",";
            }
            
            rowsAffected = myStmt.executeUpdate(mySQL);
            
            
        }
        
        catch (Exception exc) {
                exc.printStackTrace();
        }

        return rowsAffected;
    }
    */
    
    public boolean insertPatron(String fName, String lName, String phone, String email, String address) {
        int rowsAffected = 0;
        boolean successful = false;
        String mySQL;
        PreparedStatement prepMySQL;
        
        mySQL = "INSERT INTO patron (pFname,pLname,pPhone,pEmail,pAddress)"
                + "VALUES (?,?,?,?,?)";
        
        try {
            prepMySQL = myConn.prepareStatement(mySQL);
            prepMySQL.setString(1, fName);
            prepMySQL.setString(2, lName);
            prepMySQL.setString(3, phone);
            prepMySQL.setString(4, email);
            prepMySQL.setString(5, address);
            
            successful = prepMySQL.execute();
        }
        
        catch (Exception exc) {
            exc.printStackTrace();
        }
        
        finally{
            return successful;
        }
        
    }
    
    /*
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


