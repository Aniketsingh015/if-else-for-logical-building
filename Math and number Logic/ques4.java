// ques4:check if given number is single digit ,double digit or multi digit
import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
       

        if(num>=0 && num<=9){
            System.out.println("digit is single");
        }else if(num>=10 && num<=99){
            System.out.println("digit is double");
        }else{
            System.out.println("it is a multi digit"+ num);
        }
    }
}
