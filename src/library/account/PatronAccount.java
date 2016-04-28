
/**
 * PatronAccount is a subclass of Account that implements a patron account.
 * 
 *  
 * @author Benny Pena
 * @author Jeffrey Godoy
 * @author Junaid Farooq 
 * @version 1.1
 */
public class PatronAccount extends Account {
 
    private String email, address;
	private double accountBalance;
 
    /**
     * Constructor
     * @param first		Patron's First name
     * @param last		Patron's Last name
     * @param address	Patron's Address
     */
    public PatronAccount(String first, String last, String phone, String address)
    {
        super(first, last, phone);
        this.address = address;
        this.accountBalance = 0.0;
        this.email = null;
    }
    /**
     * Overloaded constructor 
     * @param first		Patron's First name 
     * @param last		Patron's Last name
     * @param address 	Patron's Address
     * @param balance 	Sets the starting balance for account
     * @param email		Patron's email
     * @param number	Patron's Phone number	
     */
    PatronAccount(String first ,String last,String address,double balance,String email,String number){
    	super(first,last,number);
        this.address = address;
        this.accountBalance = balance;
        this.email = email;
    }

    /** Returns accounts current email address on file. */
    public String getEmail() {
		return email;
	}
    
    /**
     * Sets the account's email address.
     * 
     * @param email Input new email address.
     */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/** Returns accounts current address on file. */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the account's address.
	 * 
	 * @param address  Input new address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/** Returns accounts current balance */
	public double getAccountBalance() {
		return accountBalance;
	}
	
	/**
	 * Sets the account's balance.
	 * 
	 * @param accountBalance Input new balance for account.
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
    /**
     * Take a customer's payment and deduct's it from the account balance.
     * 
     * @param amount Amount of the payment
     * @return Returns a string displaying the new account balance
     */
    public String makePayment(double amount)
    {
    	accountBalance -= amount;
        return "New Balance: " + accountBalance;
    }
    
    /**
     * Adds an amount of money to the account balance.
     * 
     * @param amount	Fee amount
     * @return			returns a string displaying the new account balance
     */
    public String addFee(double amount)
    {
    	accountBalance += amount;
        return "New Balance: " + accountBalance;
    }
 
    /**
     *applyLateFees Method--<BR>
     *This method will apply late fees to the accounts
     *that have a late fee�s exceeding $5 (by Elbin G2T3)
     *
     *@return boolean - sending back acknowledgement the late fee�s were applied 
     */
    public boolean applyLateFees(){
    	return true; //just to make it stop complaining  
    }
    
	/**
 	*billAccount Method--<BR>
 	*This method is used to bill a patron for damaged
 	*library materials (by Elbin G2T3)
 	*
 	*@param patronId - String holding the id of the patron to be billed
 	*@param mediaId - String holding the id of the media that was damaged
 	*/
	public boolean billAccount(String patronId, String mediaId){
		return true; //just to make it stop complaining 
	}

}
