package lesson10.polyexample;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class User extends Human{
    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("user class called...");
        super.run();
    }
}
