// Ques print first n term of gp
import java.util.Scanner;
public class Ques10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.print(a + " ");

        for (int i = 2; i <= n; i++) {
            int next = a * r;
            System.out.print(next + " ");
            a = next;
        }
    }
}