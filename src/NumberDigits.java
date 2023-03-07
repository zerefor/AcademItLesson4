import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int digitFromNumber;
        int digitsSum = 0;
        int oddDigitsSum = 0;
        int findMaxDigit = 0;

        while (number > 0) {
            digitFromNumber = number % 10;
            digitsSum += digitFromNumber;

            if (digitFromNumber % 2 != 0) {
                oddDigitsSum += digitFromNumber;
            }

            findMaxDigit = Math.max(digitFromNumber, findMaxDigit);
            number /= 10;
        }

        System.out.println("The largest digit: " + findMaxDigit);
        System.out.println("Sum of odd digits: " + oddDigitsSum);
        System.out.println("Sum of all digits: " + digitsSum);
    }
}