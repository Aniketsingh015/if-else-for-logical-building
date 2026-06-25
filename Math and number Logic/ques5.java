// Ques:check if number is multiple of 7 or ends with 7
 import java.util.Scanner;
public class ques5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}  

