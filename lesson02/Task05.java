package lesson02;

import java.sql.SQLOutput;

public class Task05 {

    static void checkRealNumber(float number) {
        if ((number % 1) == 0) {
            System.out.println("Число " + number + " не имеет вещественной части");
        } else {
            System.out.println("Число " + number + " имеет вещественную часть, равную " + number % 1);
        }
    }

    public static void main(String[] args) {
        float numberWithRealNumber = 3.14F;
        float numberWithoutRealNumber = 11.0F;

        Task05.checkRealNumber(numberWithRealNumber);
        Task05.checkRealNumber(numberWithoutRealNumber);
    }
}
