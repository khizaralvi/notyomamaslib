package library.media;

import java.util.Date;

/**
 * ReservationList is the class that implements a list of reservations made by
 * the users.
 *
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class Reservation {

    // private Accounts user;
    private String mediaId;
    private String patronId;
    private Date reservationDate;

    /**
     * Constructor for ReservationList.
     *
     * @param mediaId
     * @param patronId
     */
    public Reservation(String mediaId, String patronId) {
    }

    /**
     * This method will delete a reservation.
     * A canceled reservation will be stored as a CancellationList object.
     *
     */
    public void cancelReservation() {
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
