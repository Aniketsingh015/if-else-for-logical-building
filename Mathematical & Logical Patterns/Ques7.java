// Find the sum of all factors of a number.
import java.util.*;
public class Ques7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }

        }

        System.out.println("Sum of factors = " + sum);
    }
}

