// ques:take electricity units consumed and calculate the bills as per slabs(using if-else)
import java.util.Scanner;
// slabs- (0-1000)->*2 
// (1000-2000)-> *4
// (2000-3000)->*6

public class ques9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units =sc.nextInt();
        int bill=0;

        if(units>0 && units<=1000){
            bill=units*9;
            System.out.println("Bill is"+bill);
        }else if(units>1000 && units<2000){
            bill=units*10;
            System.out.println("Bill is"+bill);
        }else{
            bill=units*11;
            System.out.println("Bill is"+bill);
        }

        sc.close();


    }

} 
