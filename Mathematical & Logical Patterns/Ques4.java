// find hcf(GCD)of two numbers usig loops
// highest common factor
import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;

        // for gcd we have three apporach 
        // 1 hcf of 2 number will be leass than the smaller yes 

        // for(int i=1;i<Math.min(a,b);i++){
        //     if(a%i==0 && b%i==0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);

        // now rather checking from start and updating gcd check from  min number and the first one will be your gcd
        // for(int i=Math.min(a,b);i>=1;i--){
        //     if(a%i==0 && b%i==0){
        //         gcd=i;
        //         break;
        //     }
        // }
        // System.out.println(gcd);


        // euclidean approach gcd(a,b) = gcd(a,b%a) or gcd(a,b) = gcd(b,a%b)

        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}
