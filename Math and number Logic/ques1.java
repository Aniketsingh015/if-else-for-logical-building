
import java.util.Scanner;

// Ques:take three digit number and check if all digit are distinct

public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your three digit number");
        int number=sc.nextInt();

        int ones=number%10;
        int tenth=(number/10)%10;
        int hundredth=(number/100);

        if(ones!=tenth && tenth!=hundredth && ones!=hundredth){
            System.out.println("all digits are distinct");
        }else{
            System.out.println("digits are not distinct");
        }
        sc.close();
    }
}
