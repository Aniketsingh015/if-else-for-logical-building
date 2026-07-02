
import java.util.Scanner;

// Check if first digit + last digit = middle digit (3-digit number).

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int firstDigit = num / 100; // Extract the first digit
        int lastDigit = num % 10; // Extract the last digit
        int middleDigit = (num / 10) % 10; // Extract the middle digit      

        if (firstDigit + lastDigit == middleDigit) {
            System.out.println("The sum of the first and last digits is equal to the middle digit.");
        } else {
            System.out.println("The sum of the first and last digits is NOT equal to the middle digit.");
        }
    }
}
