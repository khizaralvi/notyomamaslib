/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.util.InputMismatchException;
import java.util.Scanner;
import library.jdbc.MediaJdbcClass;

/**
 *
 * @author jessicacarneiro
 */
public class SharedFunctions {

    public static boolean searchingModule(MediaJdbcClass media_jdbc) {
        int op = 0;
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

            // Check if it is a valid input
            try {
                op = scan.nextInt();
                String skip = scan.nextLine(); // Skipping \n character

                if (op > 0 && op <= 6) {
                    System.out.print("Type your search and press <ENTER>: ");
                    query = scan.nextLine();
                    System.out.println(media_jdbc.searchMedia(op, query));
                    return true;
                } else {
                    System.out.println("Type a valid option!");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Invalid input");
            } catch (Exception e) {
                System.out.println("An error occured. Try again.");
            }

        } while (op != 0);
        return true;
    }
}
