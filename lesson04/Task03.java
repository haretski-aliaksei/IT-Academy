package lesson04;

public class Task03 {
    public static void main(String[] args) {
        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;
        int counter = 0;
        while (counter < 11) {
            System.out.print(firstFibonacciNumber + " ");
            int sumOfPrevious = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = sumOfPrevious;
            counter++;
        }
    }
}
