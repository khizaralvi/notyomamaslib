/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import library.jdbc.ReservationJdbc;
import library.media.Reservation;

/**
 *
 * @author jessicacarneiro
 */
public class TestReservation {

    public static void main(String[] args) {

        ReservationJdbc rj = new ReservationJdbc();
        Reservation res = new Reservation(1212121, "6546464", "112121", "04/28/2016");
        // rj.connect();
        // rj.reserveMedia(res);
        System.out.print(rj.viewLibReserveList().toString());
    }
}
