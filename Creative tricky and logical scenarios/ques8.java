// Check whether sum of digits is greater than product of digits.

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;

        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            sum += digit;

            product *= digit;

            num /= 10;

        }

        if (sum > product)

            System.out.println("Sum is greater");

        else

            System.out.println("Product is greater or equal");

    }
}
