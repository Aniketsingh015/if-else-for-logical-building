// question :take a character and check if it's a vowel or consonant
import java.util.*;
public class ifelse9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("this is a vowel");
        }else{
            System.out.println("this is a consonant");
        }
    }
}