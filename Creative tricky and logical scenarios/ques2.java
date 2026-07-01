// Check whether three numbers form a Pythagorean Triplet.-> a*a + b*b = c*c
 import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter first number");
    int b=sc.nextInt();
    System.out.println("enter first number");
    int c=sc.nextInt();

    if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b)){
        System.out.println("They are pythagorean triplet");
    }else{
        System.out.println("not a pythagorean tripet");
    } 
    }
    
}
