package lesson03;

public class Task04 {
    public static void main(String[] args) {
        int currentDay = 222;

        switch (currentDay) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Good night");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Good morning");
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Have a good day");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("Good evening");
                break;
            default:
                System.out.println("Incorrect value. Please enter any value from 0 to 23");
        }
    }
}
