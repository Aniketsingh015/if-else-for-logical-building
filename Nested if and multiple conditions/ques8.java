// Ques:take an alphabet character and check whether it lies between a to m or n to z
import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet character:");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            if(ch>='a' && ch<='m'){
                System.out.println("The character lies between a to m");
            }else{
                System.out.println("The character lies between n to z");
            }
        }else{
            System.out.println("Invalid input. Please enter a lowercase alphabet character.");
        }
        sc.close();
    }
}
