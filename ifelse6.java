// Question:take two numbers and print the greatest number
import java.util.*;
public class ifelse6 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int x=sc.nextInt();
    System.out.println("enter second number");
    int y=sc.nextInt();

    if(x>y){
        System.out.println("the greatest number is "+x);
    }else if(x<y){
        System.out.println("the greatest number is "+y);
    }else{
        System.out.println("both numbers are equal");
    }
}    
}
