package media_mgt;

import java.util.Date;

/**
 * ReservationList is the class that implements a list of reservations made by
 * the users.
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class ReservationList extends Media {

    // private Accounts user;
    private Media mediaReserved;
    private Date reservationDate;

    /**
     * Constructor for ReservationList.
     *
     * @param id Media unique identifier
     * @param title Media title
     * @param year Media publishing year
     * @param cost Media cost
     */
    public ReservationList(String id, String title, String year, double cost) {
        super(id, title, year, cost);
    }

    /**
     * This method will delete a reservation.
     * A canceled reservation will be stored as a CancellationList object.
     *
     * @param reservation an ReservationList object that will be deleted
     * @return an object of type CancellationList
     */
    public static CancellationList cancelReservation(ReservationList reservation) {
        CancellationList canceledReserve;
        canceledReserve = new CancellationList();
        return canceledReserve;
    }

    /**
     * Returns the Media object saved in this reservation.
     *
     * @return Media object
     */
    public Media getMediaReserved() {
        return mediaReserved;
    }

    /**
     * Sets the Media object.
     *
     * @param mediaReserved
     */
    public void setMediaReserved(Media mediaReserved) {
        this.mediaReserved = mediaReserved;
    }

    /**
     * Returns the date the reservation was created.
     *
     * @return an object of type Date
     */
    public Date getReservationDate() {
        return reservationDate;
    }

}
