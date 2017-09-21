package lesson8.ads;

/**
 * Created by Ps1X on 21.09.2017.
 */
public class CarAd extends Ad {
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }
    void confirmAd() {
        //some logic
    }
}
