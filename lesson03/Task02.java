package lesson03;

public class Task02 {
    public static void main(String[] args) {
        int dayOfWeek = 54564;
        if (dayOfWeek == 1) {
            System.out.println("1 - Today is Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("2 - Today is Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("3 - Today is Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("4 - Today is Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("5 - Today is Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("6 - Today is Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("7 - Today is Sunday");
        } else {
            System.out.println("Incorrect value. Please enter any value from 1 to 7");
        }
    }
}
