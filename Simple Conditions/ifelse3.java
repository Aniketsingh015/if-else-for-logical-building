// Question:check if number is dibisible by 5 or not
import java.util.*;
public class ifelse3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();

        if(x%5==0){
            System.out.println("this number is divisible by 5");
        }else{
            System.out.println("this number is not divisible by 5");
        }
    }
}
