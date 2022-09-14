package lesson04;

public class Task03 {
    public static void main(String[] args) {
        int firstNumberFibonacci = 0;
        int secondNumberFibonacci = 1;
        int counter = 0;
        while (counter < 11) {
            System.out.println(firstNumberFibonacci);
            int sumOfPrevious = firstNumberFibonacci + secondNumberFibonacci;
            firstNumberFibonacci = secondNumberFibonacci;
            secondNumberFibonacci = sumOfPrevious;
            counter++;
        }
    }
}
