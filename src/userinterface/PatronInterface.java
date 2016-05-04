package userinterface;

import library.jdbc.ReservationJdbc;
import library.media.Reservation;

/**
 * Interface that will be displayed for patron users.
 * 
 * @author Jéssica Carneiro 
 */
public class PatronInterface {
    public static void main(String [] args) {
        int option = 0;
        
        do {
            System.out.println("Welcome to Not Your Mamas's Library!");
            System.out.println("Menu options:");
            System.out.println("1. Search media");
            System.out.println("2. View checked out media");
            System.out.println("3. Make reservation");
            System.out.println("4. Cancel reservation");
            System.out.println("0. Exit");
            System.out.println("Type your option: ");
            
            if (option == 1) {
                
            }
            else if (option == 2) {
                
            }
            else if (option == 3) {
                
            }
            else if (option == 4) {
                
            }
            else if (option == 0) {
                System.out.println("Bye bye!");
            }
            else {
                System.out.println("Please, type a valid option: ");
            }
            
        } while(option != 0);
    }
}
