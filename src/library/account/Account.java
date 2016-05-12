package library.account;

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

public abstract class Account {

    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    
    /**
     * Constructor
     * Account Type ('P' for Patron, 'L' for Librarian, 'A' for Administrator)
     * 
     * @param first     First Name on Account
     * @param last      Last Name on Account
     * @param number    Phone Number on Account
     */
    public Account(String first ,String last, String number){
    	firstName = first;
    	lastName = last;
    	phoneNumber = number;
    }
    
    /** 
     * Returns Account ID number.
     * 
     * @return Account ID as String
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the ID of the Account.
     * 
     * @param id The ID number of an Account as String
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Returns the First Name associated with the account.
     * 
     * @return First Name as String.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the First Name on the account.
     * 
     * @param firstName First Name as String.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /** Returns the Last Name associated with the account.
     * 
     * @return Last Name as String
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the Last Name on the Account.
     * 
     * @param lastName Changes the last name associated with the account.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /** 
     * Returns the Phone Number associated with the Account.
     * 
     * @return Phone Number as String.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * Sets the phone number on the Account.
     * 
     * @param phoneNumber Phone Number as String.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /** 
     * Displays basic account information:
     * First name,
     * @return String
     * toString for Account class */
    @Override
    public String toString(){
        String v1,v2,v3,v4,tPhone;
        
        v1 = getId();
        v2 = getFirstName();
        v3 = getLastName();
        
        tPhone = getPhoneNumber();
        v4 = "(" + tPhone.substring(0, 3) + ") "
                + tPhone.substring(3, 6)
                + "-" + tPhone.substring(6);
        
        return String.format("ID: %s %n"
                + "First Name: %s %n"
                + "Last Name: %s %n"
                + "Tel. Number: %s",v1,v2,v3,v4);
    }
    
    /**
     * Compares two accounts to see if they are equal.
     * @param a Account to compare to.
     * @return true if accounts are equal.
     */
    public boolean equals(Account a){
    	return true;
    }
            
    /**
     * Returns 'P' for Patron (default account type), 'L' for Librarian, 'A' for Administrator 
     * 
     * @return true if accounts are equal.
     */
    public abstract char getAccountType();
    
    public static String enterFirstName(){
        return TypeSafe.name("First Name: ");
    }
    
    public static String enterLastName(){
        return TypeSafe.name("Last Name: ");
    }
    
    public static String enterPhoneNum(){
        return TypeSafe.phone("Phone Number: ");
    }
    
    public static String enterAddress(){
        return TypeSafe.address("Address: ");
    }
    
    public static String enterEmail(){
        return TypeSafe.address("Email: ");
    }
    
    
}
