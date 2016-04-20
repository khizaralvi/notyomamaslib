/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.jdbc;

import library.media.Reservation;

/**
 * Reservation_JDBC class is the class that uses JDBC service package to
 * manipulate the data
 *
 * @author Adil Imam
 */
public class ReservationJdbc {

    /**
     * This method lets us reserve one media for one specific patron
     *
     * @param r reservation object passed from control class which tells us
     * which patron has reserved what media
     * @return Boolean represents whether the desired operation was successful
     * or not
     */
    public Boolean ReserveMedia(Reservation r) {
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

    }

}
