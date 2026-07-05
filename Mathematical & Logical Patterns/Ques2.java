// print cube of number from 1 to n code
// we can use Math.pow()metyhod but remeber it retrn double value so we have to cast it into int
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * i * i);
        }
    }
}

