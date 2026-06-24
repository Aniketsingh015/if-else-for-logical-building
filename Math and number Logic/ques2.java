// Ques:Take a 3-digit number and determine if the middle digit is the largest, smallest, or
// neither.
import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit of yours:");
        int nums=sc.nextInt();
        int ones=nums%10;
        int tenth=(nums/10)%10;
        int hundredth=(nums/100);

        if(tenth>ones && tenth>hundredth){
            System.out.println("tenth is largest of all");
        }else if(tenth<ones && tenth<hundredth){
            System.out.println("Tenth is smallest of all");
        }else{
            System.out.println("tenth is nor smallest neither largest");
        }

        sc.close();



    }
}
