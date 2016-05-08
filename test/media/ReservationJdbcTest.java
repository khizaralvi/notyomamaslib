package media;


import library.jdbc.ReservationJdbc;
import library.media.Media;
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
        Media m = new Media(1);
        Reservation r = new Reservation();
        Reservation r2;
        r.setMediaId(1);
        r.setPatronId(2);
        r.setReservationDate("05/07/2016");
        
        System.out.println(rj.reserveMedia(r));
        
        r2 = rj.deleteReservation(9);
    }
}
