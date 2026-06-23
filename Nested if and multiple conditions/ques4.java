// question:check if one of two number is multiple of other or not
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%b==0){
            System.out.println(b+" is a multiple of "+a);
        }else if(b%a==0){
            System.out.println(a+" is a multiple of "+b);
        }else{
            System.out.println("Neither number is a multiple of the other.");
        }

        sc.close();
    }
}
