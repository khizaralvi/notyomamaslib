package library.media;

import java.util.ArrayList;
import library.jdbc.ReservationJdbc;

/**
 * This is a ReservationCollection Class which will have collection of
 * reservation objects.
 *
 */
public class ReservationCollection {

    public ArrayList<Reservation> reservList;
   // private ReservationJdbc reserve=;

    public ReservationCollection() {
        reservList = new ArrayList();
        //reserve = ;
    }

    /**
     * This method allows us reserve one media for one specific patron.
     *
     * @param r reservation object passed from control class which tells us
     * which patron has reserved what media.
     * @return true if the desired operation was successful, false otherwise
     */
    public boolean reserveMedia(Reservation r) {
        reservList.add(r);
        return false;
    }
    
    /**
     * Delete a reservation given its reservation id.
     * @param reservationId the reservation id
     * @return the deleted object
     */
    public Reservation deleteReservation(String reservationId) {
        Reservation deletedR = new Reservation();
        return deletedR;
    }

    /**
     * This method lets us view all reserved media for one specific patron
     *
     * @param Patronid represents patron whose reservation is required to be
     * displayed
     * @return an ArrayList with all reservations for that specific patron
     */
    public ArrayList<Reservation> viewPatronReserveList(String Patronid) {
        return reservList;
    }

    /**
     * This method display all the reserved media in the library.
     * @return an ArrayList with all reserved items in the library
     */
    public ArrayList<Reservation> viewLibReserveList() {
        return reservList;
    }

    /** Prints the reservation collection.
     * @return string formatted with all reservation objects
     */
    @Override
    public String toString() {
        return "ReservationCollection{" + "reservation=" + reservList + '}';
    }

    /**
     * Returns the ArrayList of reservations. 
     * @return ArrayList lets you return the arrayList holding objects of
     * Reservation
     */
    public ArrayList<Reservation> getArr() {
        return reservList;
    }

}
