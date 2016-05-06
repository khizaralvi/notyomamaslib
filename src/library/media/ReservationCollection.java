package library.media;

import java.util.ArrayList;
import library.jdbc.ReservationJdbc;

/**
 * This is a ReservationCollection Class which will have collection of
 * reservation objects.
 *
 */
public class ReservationCollection {

    public ArrayList<Reservation> reserveList;
    private ReservationJdbc reserveJdbc;

    public ReservationCollection() {
        reserveList = new ArrayList();
    }

    /**
     * This method allows us reserve one media for one specific patron.
     *
     * @param m media object to be reserved
     * @return true if the desired operation was successful, false otherwise
     */
    public boolean reserveMedia(Media m) {
        Reservation r = new Reservation();
        r.setMediaId(m.getMediaId());
        return reserveJdbc.reserveMedia(r);
    }
    
    /**
     * Delete a reservation given its reservation id.
     * @param reservationId the reservation id
     * @return the deleted object
     */
    public Reservation deleteReservation(String reservationId) {
        Reservation deletedR = new Reservation();
        return reserveJdbc.deleteReservation(deletedR);
    }

    /**
     * This method lets us view all reserved media for one specific patron
     *
     * @param Patronid represents patron whose reservation is required to be
     * displayed
     * @return an ArrayList with all reservations for that specific patron
     */
    public ArrayList<Reservation> viewPatronReserveList(String Patronid) {
        return reserveJdbc.viewPatronReserveList(Patronid);
    }

    /**
     * This method display all the reserved media in the library.
     * @return an ArrayList with all reserved items in the library
     */
    public ArrayList<Reservation> viewLibReserveList() {
        return reserveJdbc.viewLibReserveList();
    }

    /** Prints the reservation collection.
     * @return string formatted with all reservation objects
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < reserveList.size(); i++) {
            s += reserveList.get(i).toString();
            System.out.println(reserveList.get(i).toString());
            s += "\n";
        }
        return s;
    }

    /**
     * Returns the ArrayList of reservations. 
     * @return ArrayList lets you return the arrayList holding objects of
     * Reservation
     */
    public ArrayList<Reservation> getArr() {
        return reserveList;
    }

}
