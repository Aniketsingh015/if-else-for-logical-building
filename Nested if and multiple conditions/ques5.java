// ques:take hour as input and print the time of the day according to the following criteria:
    // 4-11: Good Morning
    // 12-15: Good Afternoon
    // 16-20: Good Evening
    // 21-4: Good Night
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour (0-23):");
        int hour=sc.nextInt();
        if(hour>=4 && hour<=11){
            System.out.println("Good Morning");
        }else if(hour>=12 && hour<=15){
            System.out.println("Good Afternoon");
        }else if(hour>=16 && hour<=20){
            System.out.println("Good Evening");
        }else if((hour>=21 && hour<=23) || (hour>=0 && hour<4)){
            System.out.println("Good Night");
        }else{
            System.out.println("Invalid hour entered. Please enter a value between 0 and 23.");
        }
        sc.close();
    }
}
