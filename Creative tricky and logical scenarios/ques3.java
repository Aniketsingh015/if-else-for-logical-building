// Check whether a given day and month form a valid date (ignore leap years).
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int date =sc.nextInt();
        int month=sc.nextInt();

        boolean valid=false;
        if(month>=1 && month<=12){
            if(month ==2){
                valid = date>=1 && date<=28;
            }else if (month==4 || month==6 || month==9 || month==12){
                valid = date>=1 && date<=30;
            }else{
                valid = date>=1 && date <=31;
            }
        }else{
            System.out.println("month is not valid");
        }

        if(valid){
            System.out.println("the date and month is valid");
        }else{
            System.out.println("sorry");
        }
    }
}
