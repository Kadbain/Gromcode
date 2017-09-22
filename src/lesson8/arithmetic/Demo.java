package lesson8.arithmetic;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.check(new int[]{1, 5, 7, 12, 21}));
        System.out.println(adder.add(12, -2));
    }
}
