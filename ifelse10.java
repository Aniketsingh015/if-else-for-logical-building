// question:take a character and check whether it's a upper case,lowercase or a digit,or special character
import java.util.*;
public class ifelse10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("it is an uppercase letter");
        }else if(Character.isLowerCase(ch)){
            System.out.println("it is a lowercase letter");
        }else if(Character.isDigit(ch)){
            System.out.println("it is a digit");
        }else{
            System.out.println("it is a special character");
        }
    }
}
