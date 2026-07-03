// find the sum of digit in given number
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        while(number>0){
            int digit=number%10;
            sum=sum+digit;
            number/=10;

        }
        System.out.println("sum of digit:"+sum);
    }
}
