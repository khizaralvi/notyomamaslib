package userinterface;

import library.account.LoginCollection;
import library.account.PatronAccount;
import java.util.Scanner;
import library.account.Login;
import static userinterface.LibrarianInterface.librarianInterface;

public class Main {
	
	public static final String staffMenu = "Please Enter,\n[1] Look up Account\n[2] Restock Media\n[3] Update Account\n[4] Logout";
	public static final String patronMenu = "";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean login = false;
		print("Hello, Welcome to the Libaray System");
		int input = 0;
		Login a;
		PatronAccount p;
		while(!login){
			print("Please Enter,\n[1] Staff Login\n[2] Patron Login\n[3] Register (Patron Only)");
			input = scan.nextInt();
			switch(input){
		
			case 1:
				print("Username:");
				String user = scan.next();
				print("Password:");
				String pass = scan.next();
				a = LoginCollection.loginStaff(user, pass);
				
				if(a == null){
					login = false;
					print("Could not login!");
				}
				else{
					login = true;
					print("Welcome "+a.getUsername());
					// print(staffMenu);
                                        librarianInterface();
					input = scan.nextInt();
					switch(input){
					case 4:
						//update any changes
						print("Goodbye!");
						login = false;
						break;
					default:
						print("Something went wrong");
						break;
					}
						
				}
				break;
			
			case 2:
				print("");
				break;
			case 3:
				print("");
				break;
			default:
				print("");
				break;
			}
		}
		
	}
	
	private static void print(String x){
		System.out.println(x);
	}
}
