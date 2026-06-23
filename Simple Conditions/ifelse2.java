// Question:check if a number is odd or even
import java.util.*;
public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();

        if(x%2==0){
            System.out.println("this number is even");
        }else{
            System.out.println("this number is odd");
        }

    }
}
