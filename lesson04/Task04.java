package lesson04;

public class Task04 {
    public static void main(String[] args) {
        int firstLoopCounter = 1;
        int secondLoopCounter = 1;
        while (firstLoopCounter < 11) {
            while (secondLoopCounter < 11) {
                System.out.print(firstLoopCounter * secondLoopCounter + " ");
                secondLoopCounter++;
            }
            System.out.println();
            firstLoopCounter++;
            secondLoopCounter = 1;
        }
    }
}
