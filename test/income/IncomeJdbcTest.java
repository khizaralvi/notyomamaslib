/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package income;
import library.income.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Elbin and Alan
 */
public class IncomeJdbcTest {
    
    public static void main(String[] args)
	{
	IncomeCol collection = new IncomeCol();
//	Income num1 = new Income("12345678", 'l', 5.75 , new Date());
//	Income num2 = new Income("12312312", 'g', 600.00 , new Date());
//	Income num3 = new Income("12345678", 'd', 10.00 , new Date());
//	
//	collection.insert(num1);
//	collection.insert(num2);
//	collection.insert(num3);
	
	System.out.println(collection);
	
//	IncomeJDBC databaseIncome = new IncomeJDBC(); 
//	databaseIncome.connect();
	
//	PatronJDBC pDB = new PatronJDBC();
//	pDB.applyLateFees();
	
	System.out.println("This is the testing of view on *\n\n");
	ArrayList<Income> arr = collection.view('*');
	
	System.out.println(arr);
	
	System.out.println("This is the testing of view on l\n\n");
	arr = collection.view('l');
	
	System.out.println(arr);
	
	System.out.println("This is the testing of view on g\n\n");
	arr = collection.view('g');
	
	System.out.println(arr);
	
	
	}
    
}
