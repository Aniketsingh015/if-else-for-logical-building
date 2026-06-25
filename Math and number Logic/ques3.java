// Ques3:take a 4 digit number and check first and last digit are equal 
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        // go for digit extraction 
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();

        int ones=nums%10;
        int tenth=(nums/10)%10;
        int hundred=(nums/100)%10;
        int thousand=nums/1000;

        if(ones!=thousand){
            System.out.println("not equal");
        }else{
            System.out.println("digits are equal");
        }

        sc.close();

    }
}
