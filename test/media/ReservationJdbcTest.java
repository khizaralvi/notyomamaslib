package media;


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
//        Reservation res1 = new Reservation(111111, "112121", "8921081", "03/25/2016");
//        Reservation res2 = new Reservation(909101, "112121", "2323232", "05/05/2016");
//        Reservation res3 = new Reservation(122390, "121223", "5454545", "04/25/2016");
//        Reservation res4 = new Reservation(676765, "091223", "0291921", "05/03/2016");
//        rj.reserveMedia(res1);
//        rj.reserveMedia(res2);
//        rj.reserveMedia(res3);
//        rj.reserveMedia(res4);
        System.out.println(rj.viewPatronReserveList("8921081").toString());
    }
}
