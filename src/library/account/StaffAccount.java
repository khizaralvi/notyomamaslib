
/**
 * StaffAccount is a subclass of Account that implements a staff account.
 * 
 * @author Benny Pena
 * @author Jeffrey Godoy
 * @author Junaid Farooq 
 * @version 1.1
 */
public class StaffAccount extends Account{
	
	private char accountType;


    /**
     * Constructor
     * 
     * @param first First Name of employee.
     * @param last Last Name of employee.
     * @param phone Phone number of employee.
     * @param accountType Staff account type ('L' for Librarian or 'A' for Administrator).
     */
    public StaffAccount(String first, String last, String phone, char accountType)
    {
        //add account type
    	super(first, last, phone);
    	this.accountType = accountType;
    }
    
    /** Returns the char account type value. */
    public char getAccountType() {
            return accountType;
    }
    
    /**
     * Sets the account type.
     * 
     * @param accountType char value of account type ('L' for Librarian or 'A' for Administrator).
     */
    public void setAccountType(char accountType) {
        this.accountType = accountType;
    }
    /**
     * Search for an account using account ID as key.
     * 
     * @param id ID to use a search key.
     * @return Account object.
     */
    public static Account searchByID(String id){
    	//move to parent Account and override?
    	//JDBC x = new JDBC();
    	//return x.search(id);
    	return null;	
    }
    /**
     * Search for an account using telephone number as key.
     * 
     * @param phone telephone number to use as search key.
     * @return Account object.
     */
    public static Account searchByPhone(String phone){
    	//move to parent Account and override?
    	//JDBC x = new JDBC();
    	//return x.search(first,last);
    	return null;
    }

}
