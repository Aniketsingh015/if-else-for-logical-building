// Print first n terms of an arithmetic progression (a, d).
import java.util.Scanner;
public class Ques9 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

       System.out.print(a + " ");

        for (int i = 2; i <= n; i++) {
            int next = a + d;
            System.out.print(next + " ");
            a = next;
}
    }

}
