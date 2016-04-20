/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.media;

import java.util.ArrayList;
import library.jdbc.ReservationJdbc;

/**
 * This is a ReservationCollection Class which will have collection of
 * reservation objects
 *
 * @author Adil Imam
 */
public class ReservationCollection {

    private ArrayList<Reservation> reservation;
    private ReservationJdbc reserve;

    public ReservationCollection() {
        reservation = new ArrayList();
        reserve = new ReservationJdbc();
    }

    /**
     * This method lets us reserve one media for one specific patron
     *
     * @param r reservation object passed from control class which tells us
     * which patron has reserved what media
     * @return Boolean represents whether the desired operation was successful
     * or not
     */
    public Boolean ReserveMedia(Reservation r) {
        reservation.add(r);
        return false;
    }

    /**
     * This method lets us view all reserved media for one specific patron
     *
     * @param Patronid represents patron whose reservation is required to be
     * displayed
     */
    public void View_SpecificUser_ReservationList(String Patronid) {

    }

    /**
     * This method display all the reserved books in the library
     */
    public void view_All_Reservation_List() {

        reservation.toString();

    }

    @Override
    public String toString() {
        return "ReservationCollection{" + "reservation=" + reservation + '}';
    }

    /**
     *
     * @return ArrayList lets you return the arrayList holding objects of
     * Reservation
     */
    public ArrayList<Reservation> getArr() {
        return reservation;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

}
