// Check whether three numbers are in Arithmetic Progression (AP).diffrence between consecutive numbers is same.
import java.util.Scanner;
public class ques5 {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if ((b - a) == (c - b)) {
            System.out.println("Arithmetic Progression");
        } else {
            System.out.println("Not an Arithmetic Progression");
        }
    }

}
