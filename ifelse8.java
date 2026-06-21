// Question:take a temperature in celsius and print whether it is hot or cold or warm
import java.util.*;
public class ifelse8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temp in celcius");
        int temp=sc.nextInt();

        if(temp<0 && temp<=10){
            System.out.println("it is cold");
        }else if(temp>10 && temp<=30){
            System.out.println("it is warm");
        }else if(temp>30){
            System.out.println("it is hot");
        }else{
            System.out.println("invalid input");
        }
    }
}
