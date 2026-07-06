// check if number is strong number(sum of factorial of digit=number)
import java.util.*;
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int orignal=number;
        int sum=0;
        while(number>0){
            int digit=number%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            number/=10;

        }
        if(sum==orignal){
            System.out.println("strong number");
        }else{
            System.out.println("not strong number");
        }
    }
}
