// Check whether three numbers are in Geometric Progression (GP).division between two consecutive numbers is same.
import java.util.Scanner;
public class ques6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a != 0 && b != 0 &&
            (double)b / a == (double)c / b) {

            System.out.println("Geometric Progression");
        } else {
            System.out.println("Not a Geometric Progression");
        }
    }
}

