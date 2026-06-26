// Ques:take two numbers and check both are positivie and sum is less than 100

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x>0 && y>0){
            System.out.println("Both numbers are positive now proceed with checking sum");
            if(x+y<100){
                System.out.println("Sum of both of them is less thn 100");
            }else{
                System.out.println("sum is greater than 100");
            }
        }else{
            System.out.println("number is not positive");
        }
    }
}
