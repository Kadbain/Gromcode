package lesson8.arithmetic;

public class Arithmetic {
    public boolean check (int[] array) {
        if ((array[0] + array[array.length-1]) > 100) {
            return true;
        } else  {
            return false;
        }
    }
}
