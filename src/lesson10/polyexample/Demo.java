package lesson10.polyexample;

/**
 * Created by Ps1X on 28.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);
        System.out.println();
        User user = new User("Jack");
        run(user);
    }
    private static void run (Human human) {
        human.run();
    }
}
