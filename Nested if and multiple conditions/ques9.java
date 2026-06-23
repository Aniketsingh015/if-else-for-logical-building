// ques:take a day number(1-7) and print the day name
import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a day number (1-7):");
        // int dayNumber=sc.nextInt();
        // if(dayNumber==1){
        //     System.out.println("Monday");
        // }else if(dayNumber==2){
        //     System.out.println("Tuesday");
        // }else if(dayNumber==3){
        //     System.out.println("Wednesday");
        // }else if(dayNumber==4){
        //     System.out.println("Thursday");
        // }else if(dayNumber==5){
        //     System.out.println("Friday");
        // }else if(dayNumber==6){
        //     System.out.println("Saturday");
        // }else if(dayNumber==7){
        //     System.out.println("Sunday");
        // }else{
        //     System.out.println("Invalid day number entered. Please enter a value between 1 and 7.");
        // }
        // sc.close();

        // using switch case
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number (1-7):");
        int dayNumber=sc.nextInt();
        switch(dayNumber){
            case 1:
                System.out.println("Monday");           
        break;
            case 2:
                System.out.println("Tuesday");
        break;
            case 3:
                System.out.println("Wednesday");
        break;
            case 4:
                System.out.println("Thursday");
        break;
            case 5: 
                System.out.println("Friday");
        break;
            case 6:
                System.out.println("Saturday");
        break;
            case 7:
                System.out.println("Sunday");
        break;
            default:
                System.out.println("Invalid day number entered. Please enter a value between 1 and 7");
    }
}
}
