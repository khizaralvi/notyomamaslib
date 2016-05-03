
import java.sql.*;
import javax.sql.*;

public class LoginJDBC {
	
	private static String url = "jdbc:mysql://localhost:3306/";
	private static String username = "admin";
	private static String password = "admin";
	private static String table = "login";
	

	
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
		Connection connection = null;
		PreparedStatement statement;
		String sql = "INSERT into ? values (id = ? , user = ? , pass = ?)";
		try {
			connection = DriverManager.getConnection(url,username,password);
			statement = connection.prepareStatement(sql);
			
			statement.setString(0, table);
			statement.setString(1, associatedAccount.getId());
			statement.setString(2, associatedAccount.getFirstName());
			statement.setString(3, associatedAccount.getPhoneNumber());
			
			
			if(statement != null)
				statement.close();
			if(connection != null)
				connection.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	/**
	 * Deletes an account's login credentials
	 * @param associatedAccount
	 * @return Confirmation of action
	 */
	public static boolean deleteLogin(Account associatedAccount){
		Connection connection = null;
		PreparedStatement statement;
		String sql = "INSERT into login values (id = ? , user = ? , pass = ?)";
		try {
			connection = DriverManager.getConnection(url,username,password);
			statement = connection.prepareStatement(sql);
			
			statement.setString(0, table);
			statement.setString(1, associatedAccount.getId());
			statement.setString(2, associatedAccount.getFirstName());
			statement.setString(3, associatedAccount.getPhoneNumber());
			
			
			if(statement != null)
				statement.close();
			if(connection != null)
				connection.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
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
		
		Connection connection = null;
		PreparedStatement statement;
		String sql = "insert into login values (id = ? , user = ? , pass = ?)";
		
		try {
			connection = DriverManager.getConnection(url,username,password);
			statement = connection.prepareStatement(sql);
			
			statement.setString(0, table);
			statement.setString(1, associatedAccount.getId());
			statement.setString(2, associatedAccount.getFirstName());
			statement.setString(3, associatedAccount.getPhoneNumber());
			
			
			if(statement != null)
				statement.close();
			if(connection != null)
				connection.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
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
