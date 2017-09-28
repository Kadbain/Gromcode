package lesson10.dz;

import java.util.Date;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class ElectronicsOrder extends Order{
    private int guaranteeMonths;

    public ElectronicsOrder(Date dateConfirmed, Date dateShipped, double totalPrice, int guaranteeMonths) {
        super(dateConfirmed, dateShipped, totalPrice);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    void validateOrder() {

    }

    @Override
    void calculatePrice() {

    }
}
