import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number:");
        int startNumber = scanner.nextInt();

        System.out.print("Enter range end:");
        int endNumber = scanner.nextInt();

        int numbersSum = 0;
        int numbersQuantity = 0;
        int evenNumbersSum = 0;
        int evenNumbersQuantity = 0;
        int i = startNumber;

        while (i <= endNumber) {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                ++evenNumbersQuantity;
            }
            numbersSum += i;
            ++numbersQuantity;
            ++i;
        }

        double evenArithmeticMean = (double) evenNumbersSum / evenNumbersQuantity;
        double arithmeticMean = (double) numbersSum / numbersQuantity;

        System.out.println("Numbers sum = " + numbersSum);
        System.out.println("Even numbers sum = " + evenNumbersSum);
        System.out.println("Arithmetic mean = " + arithmeticMean);
        System.out.println("Even arithmetic mean = " + evenArithmeticMean);
    }
}