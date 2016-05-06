package library.media;

/**
 * This class holds attributes required to a reservation of a specific media by
 * a specific patron.
 * <ul>
 * <li>Media ID</li>
 * <li>Patron ID</li>
 * <li>Reservation ID</li>
 * <li>Reservation date</li>
 * </ul>
 */
public class Reservation {

    private String mediaId;
    private String patronId;
    private int reservationId;
    private String reservationDate;

    /**
     * Default constructor.
     */
    public Reservation() {
    }

    /**
     *
     * @param reservationId reservation id
     * @param mediaId the unique id for every single media
     * @param patronId the unique id for every single patron
     * @param date date
     *
     */
    public Reservation(int reservationId, String mediaId, String patronId, String date) {
        setReservationId(reservationId);
        setMediaId(mediaId);
        setPatronId(patronId);
        setReservationDate(date);
    }

    /**
     * This method returns the media id for which the reservation was made.
     *
     * @return String
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * This method sets the media id for which the reservation is being made.
     *
     * @param mediaId the unique id for every single media
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * This method returns the patron id of the reservation.
     *
     * @return the unique id for every single patron
     */
    public String getPatronId() {
        return patronId;
    }

    /**
     * This method sets the patron id of the reservation.
     *
     * @param patronId the unique id for every single patron
     */
    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    /**
     * This method returns the reservation id .
     *
     * @return the date in which the reservation was made
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * This method sets the reservation id.
     *
     * @param reservationId reservation id
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * This method returns the date in which the reservation was made.
     *
     * @return the date in which the reservation was made
     */
    public String getReservationDate() {
        return reservationDate;
    }

    /**
     * This method sets the reservation date to the current date.
     *
     * @param date Current date
     */
    public void setReservationDate(String date) {
        this.reservationDate = date;
    }

    /**
     * This method is used to print a reservation entry.
     *
     * @return media id, patron id, reservation date in the following format:
     * <br>
     * 43D2B 123127 03/15/2016
     */
    @Override
    public String toString() {
        return "ID:" + reservationId + " Media:" + mediaId + " Patron:" + patronId + " Date:"
                + reservationDate;
    }

    /**
     * This method is used to compare two reservation objects.
     *
     * @param r object of type Reservation
     * @return true if two reservations are the same, false otherwise
     */
    public boolean equals(Reservation r) {
        return this.mediaId.equals(r.mediaId)
                && this.patronId.equals(r.patronId)
                && this.reservationDate.equals(r.reservationDate);
    }

}
