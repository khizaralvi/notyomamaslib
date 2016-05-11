/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.util.ArrayList;
import java.util.Scanner;
import library.jdbc.MediaJdbcClass;
import library.jdbc.ReservationJdbc;
import library.media.Media;
import library.media.MediaCollection;
import library.media.Reservation;
import library.media.ReservationCollection;

/**
 * Interface that will be displayed for librarian users.
 *
 * @author Jéssica Carneiro
 */
public class LibrarianInterface {

    static MediaJdbcClass mc = new MediaJdbcClass();
    static ArrayList<Media> media = new ArrayList<>();
    static Reservation reservation = new Reservation();
    static ReservationJdbc rj = new ReservationJdbc();
    static ReservationCollection rc = new ReservationCollection();
    static int patronId; // This will be replaced by a PatronAccount object

    public static void librarianInterface() {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Welcome to Not Your Mamas's Library!");
            System.out.println("MENU OPTIONS:");
            System.out.println("1. Search media");
            System.out.println("2. Add media");
            System.out.println("3. Delete media");
            System.out.println("4. Edit media");
            System.out.println("5. Manage reservations");
            System.out.println("6. Renew media");
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
                    if (!addingModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 3:
                    if (!deletingModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 4:
                    if (!editingModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 5:
                    if (!reservationModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 6:
                    if (!renewingModule()) {
                        System.out.println("An error occured!");
                    }
                    break;
                case 0:
                    System.out.println("Bye bye!");
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
                System.out.println("Your search resulted in " + 0 + "results");
                System.out.println(mc.searchMedia(op, query).toString());
            } else {
                System.out.println("Type a valid option!");
            }

        } while (op != 0);
        return true;
    }


    public static boolean addingModule() {
        int op;
        String field;
        double cost;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> authors = new ArrayList<>();

        do {
            System.out.println("MENU OPTIONS:");
            System.out.println("1. Add an academic material");
            System.out.println("2. Add a book");
            System.out.println("3. Add a movie");
            System.out.println("0. Return to previous menu");
            System.out.print("Type your option: ");
            op = scan.nextInt(); // Implement a parser to check if is int

            if (op == 1) {
                System.out.print("Type the title and press <ENTER>: ");
                field = scan.next();
                // academic.setTitle(field);
                System.out.print("Type the year of the publication and press <ENTER>: ");
                field = scan.next();
                // academic.setYear(field);
                System.out.print("Type the publisher name and press <ENTER>: ");
                field = scan.next();
                // academic.setPublisher(field);
                System.out.print("Type the type of academic material and press <ENTER>: ");
                field = scan.next();
                // academic.setCategory(field);
                System.out.print("Type the number of pages and press <ENTER>: ");
                field = scan.next();
                // academic.setNumberOfPages(field);
                System.out.print("Type the cost of the material and press <ENTER>: ");
                cost = scan.nextDouble();
                // academic.setCost(cost);
                System.out.println("Type the author names separated by comma and press <ENTER> to finish the author list: ");
                // scan.useDelimiter(",");
                //System.out.println(field);
                // field = scan.nextLine();
                // academic.addAuthor(field);

            } else if (op == 2) {
                System.out.print("Type the title and press <ENTER>: ");
                field = scan.next();
                // book.setTitle(field);
                System.out.print("Type the year of the book and press <ENTER>: ");
                field = scan.next();
                // book.setYear(field);
                System.out.print("Type the publisher name and press <ENTER>: ");
                field = scan.next();
                // book.setPublisher(field);
                System.out.print("Type the type of book and press <ENTER>: ");
                field = scan.next();
                // book.setCategory(field);
                System.out.print("Type the number of pages and press <ENTER>: ");
                field = scan.next();
                // book.setNumberOfPages(field);
                System.out.print("Type the edition and press <ENTER>: ");
                field = scan.next();
                // book.setEdition(field);
                System.out.print("Type the volume and press <ENTER>: ");
                field = scan.next();
                // book.setVolume(field);
                System.out.print("Type the ISBN and press <ENTER>: ");
                field = scan.next();
                // book.setIsbn(field);
                System.out.print("Type the cost of the material and press <ENTER>: ");
                cost = scan.nextDouble();
                // book.setCost(cost);

            } else if (op == 3) {
                System.out.print("Type the title and press <ENTER>: ");
                field = scan.next();
                // movie.setTitle(field);
                System.out.print("Type the year of the movie and press <ENTER>: ");
                field = scan.next();
                // movie.setYear(field);
                System.out.print("Type the director name and press <ENTER>: ");
                field = scan.next();
                // movie.setDirector(field);
                System.out.print("Type the running time and press <ENTER>: ");
                field = scan.next();
                // movie.setRunningTime(field);
                System.out.print("Type the cost of the material and press <ENTER>: ");
                cost = scan.nextDouble();
                // movie.setCost(cost);

            } else if (op == 0) {
                return true;
            } else {
                System.out.println("Type a valid option!");
            }

        } while (true);
    }

    public static boolean deletingModule() {
        int mediaID;
        Scanner scan = new Scanner(System.in);

        if (searchingModule()) {
            System.out.println("Type the media ID for the media you want to delete: ");
            // check quantity, ask the user to type how many copies will be deleted
            // if number == total copies, delete from database the row
            // else decrease the quantity
            mediaID = scan.nextInt();
        }
        return true;
    }

    public static boolean editingModule() {
        int mediaID;
        Scanner scan = new Scanner(System.in);

        if (searchingModule()) {
            System.out.println("Type the media ID for the media you want to edit: ");
            // prints all media attributes
            // gets type of media... different editions for different types of media
            mediaID = scan.nextInt();
        }
        return true;
    }

    public static boolean renewingModule() {
        int mediaID;
        int patronID;
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the patron ID: ");
        patronID = scan.nextInt();
        // view all patron's checked out media
        System.out.println("Type the media ID to renew: ");
        mediaID = scan.nextInt();
        // renew media

        return true;
    }

    public static boolean reservationModule() {
        int op;
        Scanner scan = new Scanner(System.in);

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
            } else if (op != 0) {
                System.out.println("Type a valid option.");
            }

        } while (op != 0);
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
