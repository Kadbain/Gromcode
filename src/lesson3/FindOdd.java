package lesson3;

/**
 На промежутке от 0 до 1000 включительно, для каждого нечетного числа выводите в консоль слово Found.
 Найдите сумму таких чисел.
 Если их сумма умноженная на 5 больше 5000, выводите в консоль Bigger, в другом случае выводите Smaller or equal
 */
public class FindOdd {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            if (!(i%2==0)) {
                System.out.println("Found");
                result += i;
            }
        }
        if (result * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller");
        }
    }
}
