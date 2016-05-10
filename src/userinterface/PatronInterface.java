package userinterface;

import java.util.Scanner;
import library.jdbc.ReservationJdbc;
import library.media.MediaCollection;
import library.media.Reservation;
import library.media.ReservationCollection;

/**
 * Interface that will be displayed for patron users.
 *
 * @author Jéssica Carneiro
 */
public class PatronInterface {

    static MediaCollection mc = new MediaCollection();
    static Reservation reservation = new Reservation();
    static ReservationJdbc rj = new ReservationJdbc();
    static ReservationCollection rc = new ReservationCollection();
    static int patronId = 2; // This will be replaced by a PatronAccount object

    public static void patronInterface() {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Welcome to Not Your Mamas's Library!");
            System.out.println("MENU OPTIONS:");
            System.out.println("1. Search media");
            System.out.println("2. View checked out media");
            System.out.println("3. Make reservation");
            System.out.println("4. Cancel reservation");
            System.out.println("0. Exit");
            System.out.print("Type your option: ");
            option = scan.nextInt(); // Implement a parser to check if is int

            if (option == 1) {
                if (!searchingModule()) {
                    System.out.println("An error occured!");
                }
            } else if (option == 2) {
                if (!checkedOutModule()) {
                    System.out.println("An error occured!");
                }
            } else if (option == 3) {
                if (!reservationModule(option)) {
                    System.out.println("An error occured!");
                }

            } else if (option == 4) {
                if (!reservationModule(option)) {
                    System.out.println("An error occured!");
                }
            } else if (option == 0) {
                System.out.println("Bye bye!");
            } else {
                System.out.println("Please, type a valid option: ");
            }
            clearConsole();
        } while (option != 0);
    }

    public static boolean searchingModule() {
        int op;
        String query;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("MENU OPTIONS:");
            System.out.println("1. Search by author");
            System.out.println("2. Search by category");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by ISBN");
            System.out.println("5. Search by title");
            System.out.println("6. Search by year");
            System.out.println("0. Return to previous menu");
            System.out.print("Type your option: ");
            op = scan.nextInt(); // Implement a parser to check if is int

            if (op > 0 && op <= 6) {
                System.out.print("Type your search and press <ENTER>: ");
                query = scan.next();
                // mc.setMedia(mc.searchMedia((String) op, query));
                System.out.println("Your search resulted in " + 0 + "results");
                // System.out.println(mc.toString());
            } else {
                System.out.println("Type a valid option!");
            }

        } while (op != 0);
        return true;
    }

    public static boolean checkedOutModule() {
        return true;
    }

    public static boolean reservationModule(int option) {
        int op;
        Scanner scan = new Scanner(System.in);

        if (option == 3) {
            do {
                System.out.println("MENU OPTIONS:");
                System.out.println("1. Reserve media");
                System.out.println("0. Return to previous menu");
                System.out.print("Type your option: ");
                op = scan.nextInt(); // Implement a parser to check if is int

                if (op == 1) {
                    System.out.println("Type the media ID: ");
                    int mediaId = scan.nextInt();
                    reservation.setMediaId(mediaId);
                    rj.reserveMedia(reservation);
                }
                else if(op != 0) {
                    System.out.println("Type a valid option.");
                }

            } while (op != 0);
        }
        if (option == 4) {
            do {
                System.out.println("MENU OPTIONS:");
                System.out.println("1. Cancel reservation");
                System.out.println("0. Return to previous menu");
                System.out.print("Type your option: ");
                op = scan.nextInt(); // Implement a parser to check if is int

                if (op == 1) {
                    // Search all reservations for this patron
                    rc.setArr(rj.viewPatronReserveList(patronId));
                   
                    // Print the reservation list for the current patron
                    System.out.println(rc.toString());
                    
                    // Cancel the reservation
                    int mediaId = scan.nextInt();
                    reservation.setMediaId(mediaId);
                    rj.deleteReservation(reservation.getReservationId());
                }
                else if(op != 0) {
                    System.out.println("Type a valid option.");
                }
            } while (op != 0);

        }
        return true;

    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }
}
