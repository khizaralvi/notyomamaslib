import static org.junit.Assert.assertEquals;
import org.junit.Test;
import library.media.Reservation;
/**
 * Testing for Reservation class.
 * @author jessicacarneiro
 */
public class ReservationTest {
  @Test
  public void setsMediaId() {
    Reservation r = new Reservation("s1242", "12345");
    assertEquals("s1242", r.getMediaId());
  }
  
  @Test
  public void setsPatronId() {
    Reservation r = new Reservation("s1242", "12345");
    assertEquals("12345", r.getPatronId());
  }
  
  @Test
  public void equalsReservation() {
    Reservation r1 = new Reservation("s1242", "12345");
    Reservation r2 = new Reservation("s1842", "12385");
    assertEquals(true, r1.equals(r1));
    assertEquals(false, r1.equals(r2));
  }
}