// ques:Take 24 hours time (hours and minutes)print whether it is am or pm
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // if time is from 0-11 print am 12-23 print pm
        System.out.println("enter hr from 0-23");
        int hour =sc.nextInt();
        int minutes=sc.nextInt();

        

        if(hour<0 || hour>23 || minutes<0 || minutes>59){
            System.out.println("time is invalid eneter again");
            
            
        }else if(hour<12){
            System.out.println(hour+":" +minutes+"AM");
        }else{
            System.out.println(hour+":" +minutes+ "PM");
        }

    }
}
