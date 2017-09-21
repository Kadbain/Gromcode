package lesson6;

import java.util.Date;

/**
 * Created by Ps1X on 20.09.2017.
 */
public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order() {
    }

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }
    public void confirmOrder() {
        isConfirmed = true;
        dateCreated = new Date();
        dateConfirmed = dateCreated;
    }
    public boolean checkPrice() {
        return price > 1000 ? true : false;
    }
    public boolean isValidType() {
        if (type.equals("Buy") || type.equals("Sale")) {
            return true;
        } else
            return false;
    }

}
