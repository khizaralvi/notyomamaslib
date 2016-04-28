import java.util.Scanner;

public class Test {
	
	public static final String menu = ""; 
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		print("What is the id of the account");
//		String id = scan.next();
//		
//		print("What is the First name of the account");
//		String first = scan.next();
//		
//		print("What is the Last name");
//		String last = scan.next();
//		
//		print("What is th phone number");
//		String pnum = scan.next();
//		
//		print("What is the email");
//		String email = scan.next();
//		
//		print("What is the address");
//		scan.nextLine();
//		String address = scan.nextLine();
//		
//		print("What is the balance");
//		Double balance = scan.nextDouble();
//		
//		PatronAccount p = new PatronAccount(first,last,address, balance,email,pnum);
		PatronAccount p1 = new PatronAccount("Test","One","1234567894","22 S Penataquit");
		
		p1.setAccountBalance(99.9);
		if(AccountCollection.updatePatron(p1))
			print("Worked!");
		else
			print("Failed!");
		
	}
	
	private static void print(String x){
		System.out.println(x);
	}
}
