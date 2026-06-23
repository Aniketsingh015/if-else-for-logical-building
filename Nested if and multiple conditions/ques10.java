// ques:Take a month number (1–12) and print the number of days in that month (ignore leap
// years).
import java.util.*;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();

        if(month==2){
            System.out.println("28 days in"+month);
        }else if(month==4 || month==6 || month==9 || month==1){
            System.out.println("30 days in "+month);
        }else if(month>=1 && month<=12){
            System.out.println("31 days in"+month);
        }else{
            System.out.println("Invalid month entered");
        }
        sc.close();
    }
}
