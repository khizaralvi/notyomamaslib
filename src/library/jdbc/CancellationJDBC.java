package library.jdbc;

import library.media.Cancellation;

public class CancellationJDBC {

    /**
     * This method lets us cancel one media for one specific patron
     *
     * @param r reservation object passed from control class which tells us
     * which patron has cancelled what media
     * @return Boolean represents whether the desired operation was successful
     * or not
     */
    public Boolean CancelMedia(Cancellation r) {
        return false;
    }

    /**
     * This method lets us view all cancelled media for one specific patron
     *
     * @param PatronId represents patron whose cancellation is required to be
     * displayed
     */
    public void View_SpecificUser_CancellationList(String PatronId) {

    }

    /**
     * This method display all the reserved books in the library
     */
    public void view_All_Cancellation_List() {

    }

}