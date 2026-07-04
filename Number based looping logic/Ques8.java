
import java.util.Scanner;

// Print fibonnaci series upto n terms
// 0 1 1 2 3 5 8 13 21 34

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int next=0;
        System.out.println(a);
        System.out.println(b);

        while(next<n){
            next=a+b;
            System.out.println(next);
            a=b;
            b=next;

        }
    }
}
