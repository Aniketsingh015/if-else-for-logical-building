// take three numbers and print the greatest number
import java.util.*;
public class ifelse7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int x=sc.nextInt();
        System.out.println("enter second number");
        int y=sc.nextInt();
        System.out.println("enter third number");
        int z=sc.nextInt();

        if(x>y && x>z){
            System.out.println("the greatest number is "+x);
        }else if(y>z){
            System.out.println("the greatest number is "+y);
        }else{
            System.out.println("the greatest number is "+z);
        }
    }
}
