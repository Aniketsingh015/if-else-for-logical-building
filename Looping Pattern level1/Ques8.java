// Ques: Print the sum of all odd numbers up to n
import java.util.*;

public class Ques8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();

        int i = 1;

        int sum = 0;

        while (i <= n) {

            sum = sum + i;

            i += 2;

        }

        System.out.println("Sum = " + sum);

    }
}
