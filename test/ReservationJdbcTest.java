
import library.jdbc.ReservationJdbc;
import library.media.Reservation;
import library.media.ReservationCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jessicacarneiro
 */
public class ReservationJdbcTest {

    public static void main(String[] args) {
        ReservationJdbc rj = new ReservationJdbc();
        ReservationCollection rc = new ReservationCollection();
//        Reservation res1 = new Reservation(12121, "112121", "1209213", "03/28/2016");
//        Reservation res2 = new Reservation(98212, "112121", "8921081", "05/01/2016");
//        Reservation res3 = new Reservation(12910, "889976", "1092812", "04/30/2016");
//        Reservation res4 = new Reservation(12109, "091223", "1209328", "05/03/2016");
//        rj.reserveMedia(res1);
//        rj.reserveMedia(res2);
//        rj.reserveMedia(res3);
//        rj.reserveMedia(res4);
        System.out.println(rj.viewPatronReserveList("112121").toString());
    }
}
