package userinterface;

import java.util.Scanner;
import library.jdbc.MediaJdbcClass;
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

    static MediaJdbcClass media_jdbc = new MediaJdbcClass();
    static Reservation reservation = new Reservation();
    static ReservationJdbc rj = new ReservationJdbc();
    static ReservationCollection rc = new ReservationCollection();
    static int patronId = 2; // This will be replaced by a PatronAccount object

    public static void patronInterface() {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("=========MENU OPTIONS:=========");
            System.out.println("1. Search media");
            System.out.println("2. View checked out media");
            System.out.println("3. Make reservation");
            System.out.println("4. Cancel reservation");
            System.out.println("0. Exit");
            System.out.print("Type your option: ");
            option = scan.nextInt(); // Implement a parser to check if is int

            switch (option) {
                case 1:
                    if (!searchingModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 2:
                    if (!checkedOutModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 3:
                    if (!reservationModule(option)) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 4:
                    if (!reservationModule(option)) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please, type a valid option: ");
                    break;
            }
        } while (option != 0);
    }

    public static boolean searchingModule() {
        int op;
        String query;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\n\n=========MENU OPTIONS:=========");
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
                System.out.println(media_jdbc.searchMedia(op, query).toString()); // Print search
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
                System.out.println("\n\n=========MENU OPTIONS:=========");
                System.out.println("1. Reserve media");
                System.out.println("0. Return to previous menu");
                System.out.print("Type your option: ");
                op = scan.nextInt(); // Implement a parser to check if is int

                if (op == 1) {
                    System.out.println("Type the media ID: ");
                    int mediaId = scan.nextInt();
                    reservation.setMediaId(mediaId);
                    if (rj.reserveMedia(reservation)) { // Try to reserve
                        System.out.println("Your reservation was successful!");
                    } else {
                        return false;
                    }
                } else if (op != 0) {
                    System.out.println("Type a valid option.");
                }

            } while (op != 0);
        }
        if (option == 4) {
            do {
                System.out.println("\n\n=========MENU OPTIONS:=========");
                System.out.println("1. Cancel reservation");
                System.out.println("0. Return to previous menu");
                System.out.print("Type your option: ");
                op = scan.nextInt(); // Implement a parser to check if is int

                if (op == 1) {
                    // Search all reservations for this patron
                    rc.setArr(rj.viewPatronReserveList(patronId));

                    // Print the reservation list for the current patron
                    System.out.println(rc.toString());

                    // Ask for media ID
                    System.out.print("Type the media ID: ");
                    int mediaId = scan.nextInt();

                    // Cancel the reservation
                    reservation.setMediaId(mediaId);
                    reservation = rj.deleteReservation(reservation.getReservationId());
                    System.out.println("The following reservation was deleted: " + reservation.toString());

                } else if (op != 0) {
                    System.out.println("Type a valid option.");
                }
            } while (op != 0);

        }
        return true;

    }

// Try to make this work
//    public final static void clearConsole() {
//        try {
//            final String os = System.getProperty("os.name");
//
//            if (os.contains("Windows")) {
//                Runtime.getRuntime().exec("cls");
//            } else {
//                Runtime.getRuntime().exec("clear");
//            }
//        } catch (final Exception e) {
//            //  Handle any exceptions.
//        }
//    }
}
