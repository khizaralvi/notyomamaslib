package Bridge_media_package;

import java.util.Date;

/**
 * CancellationList is the class that implements a list of canceled 
 * reservations made by the users.
 * 
 * @author <a href="jessicacarneiro@ufmg.br">Jéssica Carneiro</a>
 * @version 1.0.0
 */
public class CancellationList {
    
    private CheckedOutMedia mediaReserved;
    private Date dateCanceled;

    /**
     * Constructor for CancellationList.
     * 
     * @param reserved An object of type CheckedOutMedia
     * @param cancellation Date in which cancellation was performed.
     */
    public CancellationList(CheckedOutMedia reserved, Date cancellation) {
    }

    /**
     * Returns the object of type CheckedOutMedia.
     * 
     * @return object of type CheckedOutMedia
     */
    public CheckedOutMedia getMediaReserved() {
        return mediaReserved;
    }

    /**
     * Sets the object of type CheckedOutMedia.
     * 
     * @param mediaReserved object of type CheckedOutMedi
     */
    public void setMediaReserved(CheckedOutMedia mediaReserved) {
        this.mediaReserved = mediaReserved;
    }

    /**
     * Returns the date in which the cancellation was performed.
     * 
     * @return cancellation date
     */
    public Date getDateCanceled() {
        return dateCanceled;
    }

    /**
     * Sets the date in which the cancellation was performed.
     * 
     * @param dateCanceled cancellation date
     */
    public void setDateCanceled(Date dateCanceled) {
        this.dateCanceled = dateCanceled;
    }
    
}
