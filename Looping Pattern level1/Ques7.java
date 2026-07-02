// Ques: Print the sum of all even numbers up to n
import java.util.*;
public class Ques7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();

        int i = 2;

        int sum = 0;

        while (i <= n) {

            sum = sum + i;

            i += 2;

        }

        System.out.println("Sum = " + sum);

    }
}
