package lesson02;

public class Task04 {
    static int sum(int n) {
        return n >= 10 ? n % 10 + sum(n / 10) : n;
    }

    public static void main(String[] args) {
        int number = 999;
        System.out.println("Сумма цифр числа " + number + " равна " + Task04.sum(number));
    }
}
