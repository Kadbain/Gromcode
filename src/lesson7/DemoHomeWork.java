package lesson7;

import lesson6.Order;

import java.util.Date;

/**
 * Created by Ps1X on 21.09.2017.
 */
public class DemoHomeWork {
    public static void main(String[] args) {

    }
    public Order createOrder() {
        Order order = new Order(100, new Date(2017,9,21), false, null, "Dnepr", "Ukraine", "Buy");
        return order;
    }
    public Order createOrderAndCallMethods() {
        Order order = new Order(100,
                new Date(2017,9,21), true,
                new Date(2017,9,21), "Kiev", "Ukraine", "SomeValue");
        order.checkPrice();
        order.confirmOrder();
        order.isValidType();
        return order;
    }
}
