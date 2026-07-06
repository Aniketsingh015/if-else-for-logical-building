// Print all numbers between a and b divisible by 7
import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        for(int i=a;i<b;i++){
            if(i%7==0){
                System.out.println(i);
            }else{
                System.out.println("not divisible");
            }
        }
    }
}
