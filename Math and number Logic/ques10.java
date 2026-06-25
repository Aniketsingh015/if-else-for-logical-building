// Check whether a number is a perfect square (without using the square root function).
import java.util.Scanner;
public class ques10 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= num; i++) {

            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
} 

