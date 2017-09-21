package lesson6;

/**
 * Created by Ps1X on 20.09.2017.
 */
public class Car {
    // 1 fields
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;
    //2 constructors

    public Car(int price, int yearOfManufacturing, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;
    }
    // 3 methods

    void startRun() {
        System.out.println("I am running....");
    }
    void stopRun() {
        System.out.println("I am stopping....");
    }
    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }
}
