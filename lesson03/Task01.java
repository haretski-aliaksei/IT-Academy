package lesson03;

public class Task01 {
    public static void main(String[] args) {
        int dayOfWeek = 234324;

        switch (dayOfWeek) {
            case 1:
                System.out.println("1 - Today is Monday");
                break;
            case 2:
                System.out.println("2 - Today is Tuesday");
                break;
            case 3:
                System.out.println("3 - Today is Wednesday");
                break;
            case 4:
                System.out.println("4 - Today is Thursday");
                break;
            case 5:
                System.out.println("5 - Today is Friday");
                break;
            case 6:
                System.out.println("6 - Today is Saturday");
                break;
            case 7:
                System.out.println("7 - Today is Sunday");
                break;
            default:
                System.out.println("Incorrect value. Please enter any value from 1 to 7");
        }
    }
}
