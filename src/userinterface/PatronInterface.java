package userinterface;

import java.util.InputMismatchException;
import java.util.Scanner;
import library.account.Login;
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

    public static void patronInterface(Login user) {
        int option = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\n\n=========MENU OPTIONS:=========");
            System.out.println("1. Search media");
            System.out.println("2. Your checked out media");
            System.out.println("3. Your reservations");
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
                        if (!checkedOutModule(Integer.parseInt(user.getId()))) {
                            System.out.println("An error occured!");
                        }
                        break;
                    case 3:
                        if (!reservationModule(Integer.parseInt(user.getId()))) {
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

    public static boolean checkedOutModule(int userID) {
        return true;
    }

    public static boolean reservationModule(int userID) {
        int option = 0;
        int mediaID;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\n\n=========MENU OPTIONS:=========");
            System.out.println("1. Reserve media");
            System.out.println("2. Cancel reservation");
            System.out.println("3. View your reservations");
            System.out.println("0. Return to previous menu");
            System.out.print("Type your option: ");
            option = scan.nextInt();
            
            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println("\n\nSearch for media to reserve first.");
                    if (searchingModule(media_jdbc)) {
                        // Ask mediaID
                        System.out.print("Type the media ID or 0 to return: ");
                        mediaID = scan.nextInt(); // Implement a parser to check if is int
                        if (mediaID != 0) {
                            media.setMediaId(mediaID);
                            
                            // Try to reserve
                            if (reservation_collection.reserveMedia(media, userID)) {
                                System.out.println("Reservation was successful!");
                            } else {
                                return false;
                            }
                        }
                    }   break;
                case 2:
                    System.out.println("\n\nYour reservations:");
                    if (reservation_collection.viewPatronReserveList(userID).toString().equals("")) {
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
                    }   break;
                case 3:
                    System.out.println("\n\nYour reservations:");
                    if (reservation_collection.viewPatronReserveList(userID).toString().equals("")) {
                        System.out.println("No reservations were made");
                    } else {
                        System.out.println(reservation_collection.toString());
                    }   break;
                default:
                    System.out.println("Type a valid option.");
                    break;
            }
        } while (option != 0);
        return true;
    }
}
