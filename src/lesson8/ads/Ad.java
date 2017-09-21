package lesson8.ads;

import java.util.Date;

/**
 * Created by Ps1X on 21.09.2017.
 */
public class Ad extends BaseEntity{
    int price;
    Date dateCreated;


    public Ad(long id, int price) {
        super(id);
        this.price = price;
        this.dateCreated = new Date();
    }
    void publishAd() {
        // some logic
    }
}
