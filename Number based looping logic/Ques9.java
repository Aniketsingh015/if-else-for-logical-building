// print summ of first n terms of fibonacci number
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int next=0;
        int sum=0;
       

        while(next<n){
            next=a+b;
            sum+=next;
            a=b;
            b=next;

        }
        System.out.println("Sum of first " + n + " terms of Fibonacci series is: " + sum);
    }
}
