package lesson10.polyexample;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class Child extends Human {
    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("child class called...");
        super.run();
    }
}
