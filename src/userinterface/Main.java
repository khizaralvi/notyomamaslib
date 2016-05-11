package userinterface;

import library.account.LoginCollection;
import library.account.PatronAccount;
import java.util.Scanner;
import library.account.Login;
import static userinterface.LibrarianInterface.librarianInterface;

public class Main {

    public static final String staffMenu = "1. Look up Account\n2. Media Managment\n3. Update Account\n4. Logout\n";
    public static final String patronMenu = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean login = false;
        System.out.println("\n\nWelcome to Not Your Mamas's Library!");
        int input = 0;
        Login a;
        PatronAccount p;
        while (!login) {
            System.out.print("=========MENU OPTIONS:=========\n1. Staff Login\n2. Patron Login\n3. Register (Patron Only)\n0. Exit\nType an option: ");
            input = scan.nextInt();
            switch (input) {
                case 0:
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Username: ");
                    String user = scan.next();
                    System.out.print("Password: ");
                    String pass = scan.next();
                    a = LoginCollection.loginStaff(user, pass);

                    if (a == null) {
                        login = false;
                         System.out.println("Could not login!");
                    } else {
                        login = true;
                         System.out.println("Welcome " + a.getUsername());
                        // print(staffMenu);

                        while (login) {
                            
                            print(staffMenu);
                             System.out.print("Please enter an option: ");

                            input = scan.nextInt();
                            switch (input) {
                                case 1:
                                    //update any changes
                                    // print("Goodbye!");
                                    break;
                                case 2:
                                    librarianInterface();
                                    break;
                                case 3:
                                    
                                    break;
                                case 4:
                                    login = false;
                                    System.out.println("Bye bye!");
                                    break;
                                default:
                                    print("Type a valid options");
                                    break;
                            }
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

    private static void print(String x) {
        System.out.println(x);
    }
}
