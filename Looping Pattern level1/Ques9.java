// Ques: Print the factorial of a given number
import java.util.*;
public class Ques9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        int i = 1;

        long fact = 1;

        while (i <= n) {

            fact = fact * i;

            i++;

        }

        System.out.println("Factorial = " + fact);

    }
}
