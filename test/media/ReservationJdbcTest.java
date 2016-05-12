package media;

import library.jdbc.ReservationJdbc;
import library.media.Media;
import library.media.Reservation;
import library.media.ReservationCollection;

/**
 * Test class for Reservation.
 *
 * @author Jéssica Carneiro
 */
public class ReservationJdbcTest {

    public static void main(String[] args) {
        ReservationCollection rc = new ReservationCollection();
        Media m = new Media();
        m.setMediaId(1);
        rc.reserveMedia(m, 1);
    }
}
