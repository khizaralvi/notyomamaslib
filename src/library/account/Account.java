/**
 * Account Object
 * <p>
 * Superclass for Patron and Staff Account objects
 * <p>
 * @author Benny Pena
 * @author Jeffrey Godoy
 * @author Junaid Farooq
 * <p>
 * @version 1.1
 */

public class Account {

    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
   
    /**
     * Constructor
     * 
     * @param first User's first name
     * @param last User's last name
     * @param number User's phone number
     */
    public Account(String first ,String last, String number){
    	firstName = first;
    	lastName = last;
    	phoneNumber = number;
    }
    
	/** Returns ID number associated with the account. */
    public String getId() {
        return id;
    }
    
	/**
	 * This method sets the ID of the Account.
	 * 
	 * @param id This parameter represents id of the patron or librarian.
	 */
    public void setId(String id) {
        this.id = id;
    }
    
	/** Returns the first name associated with the account. */
    public String getFirstName() {
        return firstName;
    }
    
	/**
	 * This method sets the first name.
	 * 
	 * @param firstName Sets the first name associated with the account.
	 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
	/** Returns the last name associated with the account. */
    public String getLastName() {
        return lastName;
    }
    
	/**
	 * This method set last name.
	 * 
	 * @param lastName Changes the last name associated with the account.
	 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
	/** Returns account's current phone number. */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
	/**
	 * This method set the phone number.
	 * @param phoneNumber Account's new phone number.
	 */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Compares two accounts to see if they are equal.
     * @param a Account to compare to.
     * @return true if accounts are equal.
     */
    public boolean equals(Account a){
    	return true;
    }
    
    /** toString for Account class */
    public String toString(){
    	return null;
    }
    
    public char getAccountType(){
    	return 'P';
    }
    
    
}
