package Bridge_media_package;

import java.util.Date;

/**
 * ReservationList is the class that implements a list of reservations made by
 * the users.
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class ReservationList {

    // private Accounts user;
    private Media mediaReserved;
    private Date reservationDate;

    /**
     * Constructor for ReservationList.
     *
     * @param reserved
     */
    public ReservationList(Media reserved) {
    }

    /**
     * This method will delete a reservation.
     * A canceled reservation will be stored as a CancellationList object.
     *
     * @return an object of type CancellationList
     */
    public CancellationList cancelReservation() {
        CancellationList canceledReserve;
        Date curDate = new Date();
        canceledReserve = new CancellationList(this, curDate);
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
