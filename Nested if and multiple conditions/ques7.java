// ques:take two numberand determine whether  both are even or odd or one is even and other is odd
import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%2==0 && b%2==0){
            System.out.println("Both numbers are even.");
        }else if(a%2!=0 && b%2!=0){
            System.out.println("Both numbers are odd.");
        }else if(a%2==0 && b%2!=0 ){
            System.out.println("a number is even and the b is odd.");
        }else if(a%2!=0 && b%2==0){
            System.out.println("a number is odd and the b is even.");
        }else{
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
