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
    
    private Media mediaReserved;
    private Date dateReserved;
    private Date dateCanceled;

    /**
     * Constructor for CancellationList.
     * 
     * @param mediaReserved media to be reserved
     * @param dateReserved date on which media is reserved
     * @param dateCanceled date on which reservation is canceled
     */
    public CancellationList(Media mediaReserved, Date dateReserved, Date dateCanceled) {
    }

    public CancellationList() {
    }
    
}
