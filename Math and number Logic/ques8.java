// ques:Check if a number lies within the range [100, 999].
import java.util.Scanner;

public class ques8 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("Within Range");
        } else {
            System.out.println("Out of Range");
        }
    }
}

