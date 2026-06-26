// Ques5:take income and age and check if eligible for tax (age>18 and income >5L)
import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        int income=sc.nextInt();

        if(age>18 && income>500000){
            System.out.println("eligible for tax");
        }else{
            System.out.println("child");
        }
    }
}
