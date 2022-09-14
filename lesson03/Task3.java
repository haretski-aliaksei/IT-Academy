package lesson03;

public class Task3 {
    public static void main(String[] args) {
        int currentTime = 24;
        if (currentTime >= 0 && currentTime < 24) {
            if (currentTime >= 0 && currentTime <= 6) {
                System.out.println("Good night");
            } else if (currentTime > 6 && currentTime <= 9) {
                System.out.println("Good morning");
            } else if (currentTime > 9 && currentTime <= 18) {
                System.out.println("Have a good day");
            } else if (currentTime > 18 && currentTime < 24) {
                System.out.println("Good evening");
            }
        } else {
            System.out.println("Incorrect value. Please enter any value from 0 to 23");
        }
    }
}
