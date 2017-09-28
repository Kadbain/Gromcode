package lesson10.dz;

import java.util.Date;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(Date dateConfirmed, Date dateShipped, double totalPrice, String furnitureCode) {
        super(dateConfirmed, dateShipped, totalPrice);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {

    }

    @Override
    void calculatePrice() {

    }
}
