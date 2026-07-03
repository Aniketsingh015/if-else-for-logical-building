
import java.util.Scanner;

// check if number is palidrome
// 121=121

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int orignal =number;
        int reverse=0;
        while(number>0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number/=10;

        }

        if(reverse==orignal){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("sorry");
        }
    }
}
