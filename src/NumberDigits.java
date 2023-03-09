import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        number = Math.abs(number);
        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number > 0) {
            int digitFromNumber = number % 10;
            digitsSum += digitFromNumber;

            if (digitFromNumber % 2 != 0) {
                oddDigitsSum += digitFromNumber;
            }

            maxDigit = Math.max(digitFromNumber, maxDigit);
            number /= 10;
        }

        System.out.println("The largest digit: " + maxDigit);
        System.out.println("Sum of odd digits: " + oddDigitsSum);
        System.out.println("Sum of all digits: " + digitsSum);
    }
}