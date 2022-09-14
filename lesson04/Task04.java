package lesson04;

public class Task04 {
    public static void main(String[] args) {
        int counterFirstLoop = 1;
        int counterSecondLoop = 1;
        while (counterFirstLoop < 11) {
            while (counterSecondLoop < 11) {
                System.out.print(counterFirstLoop * counterSecondLoop + " ");
                counterSecondLoop++;
            }
            System.out.println();
            counterFirstLoop++;
            counterSecondLoop = 1;
        }
    }
}
