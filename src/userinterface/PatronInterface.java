package userinterface;

import java.util.InputMismatchException;
import java.util.Scanner;
import library.jdbc.MediaJdbcClass;
import library.jdbc.ReservationJdbc;
import library.media.Reservation;
import library.media.ReservationCollection;
import static userinterface.LibrarianInterface.media;
import static userinterface.LibrarianInterface.reservation_collection;
import static userinterface.SharedFunctions.searchingModule;

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
    static int patronID = 2; // This will be replaced by a PatronAccount object

    public static void patronInterface() {
        int option = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("=========MENU OPTIONS:=========");
            System.out.println("1. Search media");
            System.out.println("2. View checked out media");
            System.out.println("3. Make reservation");
            System.out.println("4. Cancel reservation");
            System.out.println("5. View reservations");
            System.out.println("0. Return to previous menu");
            System.out.print("Type your option: ");

            try {
                option = scan.nextInt(); // Implement a parser to check if is int

                switch (option) {
                    case 1:
                        if (!searchingModule(media_jdbc)) {
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
                    case 5:
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
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input");
            } catch (Exception e) {
                System.out.println("An error occured. Try again.");
            }
        } while (option != 0);
    }

    public static boolean checkedOutModule() {
        return true;
    }

    public static boolean reservationModule(int option) {
        int op = 0;
        int mediaID;
        Scanner scan = new Scanner(System.in);

        if (option == 3) {

            System.out.println("\n\nSearch for media to reserve first.");
            if (searchingModule(media_jdbc)) {
                // Ask mediaID
                System.out.print("Type the media ID or 0 to return: ");
                mediaID = scan.nextInt(); // Implement a parser to check if is int
                if (mediaID != 0) {
                    media.setMediaId(mediaID);

                    // Try to reserve
                    if (reservation_collection.reserveMedia(media, patronID)) {
                        System.out.println("Reservation was successful!");
                    } else {
                        return false;
                    }
                }
            }

        }
        if (option == 4) {

            System.out.println("\n\nYour reservations:");

            if (reservation_collection.viewPatronReserveList(patronID).toString().equals("")) {
                System.out.println("No reservations were made");
            } else {
                System.out.println(reservation_collection.toString());
                System.out.print("Type the reservationID to delete your reservation or 0 to return: ");
                int reservationID = scan.nextInt(); // Implement a parser to check if is int

                if (reservationID != 0) {
                    reservation.setReservationId(reservationID);
                    reservation = reservation_collection.deleteReservation(reservationID);

                    if (reservation != null) {
                        System.out.println("The following reservation was cancelled:\n"
                                + "Media ID: " + reservation.getMediaId()
                                + "\tPatron ID: " + reservation.getPatronId());
                    } else {
                        return false;
                    }
                }
            }
        }
        if (option == 5) {
            System.out.println("\n\nYour reservations:");

            if (reservation_collection.viewPatronReserveList(patronID).toString().equals("")) {
                System.out.println("No reservations were made");
            } else {
                System.out.println(reservation_collection.toString());
            }
        }
        return true;
    }
}
