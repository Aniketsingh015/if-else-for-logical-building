// ques:take a weekday (1-7) and determine it is weekday or weekend

import java.util.Scanner;

// Ques:Take a single digit (0-9)and print it word from 0-9
public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("weekday"+ ":Monday");
                break;

             case 2:
                System.out.println("weekday"+ ":Tuesday");
                break;   

            case 3:
                System.out.println("weekday"+ ":Wednesday");
                break;    
            
            case 4:
                System.out.println("weekday"+ ":Thrusday");
                break;
                
                
                
            case 5:
                System.out.println("weekday"+ ":Friday");
                break;  
                
                
             case 6:
                System.out.println("weekday"+ ":Saturday");
                break; 
                
            case 7:
                System.out.println("weekday"+ ":Sunday");
                break;    

            
             default:
                System.out.println("Invalid day"); 
        }


    }
}

