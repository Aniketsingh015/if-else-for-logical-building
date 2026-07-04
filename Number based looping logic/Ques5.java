// check if number is amstrong number
import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int count=0;
        int number=num;
        int sum=0;
        int orignal=num;

        while(num>0){
            num/=10;
            count++;
        }

        while(number>0){
            int digit=number%10;
            sum=sum+(int)Math.pow(digit, count);
            number=number/10;
        }
        if(sum==orignal){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not Amstrong Number");
        }
    }
}
