
import java.util.Scanner;

// find lcm of two numbers-lowest common multiple so lcm of two number will be greater than the greater number

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        // int lcm=Math.max(num1,num2);
        int gcd=1;

        // while(true){
        //     if(lcm%num1==0 && lcm%num2==0){
        //         System.out.println("lcm of two number is:"+lcm);
        //         break;
        //     }
        //     lcm++;
        // }

        // formula -> lcm(a,b) = (a*b)/hcf(a,b)

        for(int i=1;i<Math.min(num1,num2);i++){
           if(num1%i==0 && num2%i==0){
                 gcd=i;
         }
    }
     int lcm=(num1*num2)/gcd;
    System.out.println("lcm of two number is:"+lcm);
}
}