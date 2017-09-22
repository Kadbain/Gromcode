package lesson8.arithmetic;

/**
 * Created by Ps1X on 22.09.2017.
 */
public class Arithmetic {
    public boolean check (int[] array) {
        if (array[0] + array[array.length-1] > 100) {
            return true;
        } else  {
            return false;
        }
    }
}
