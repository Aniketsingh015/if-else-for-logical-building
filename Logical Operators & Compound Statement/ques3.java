// ques:take three number and print the median value
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        System.out.println("Enter value of y:");
        int y=sc.nextInt();
        System.out.println("Enter value of z:");
        int z=sc.nextInt();

        // median value means the value shouldn't be largest nor shortest

        if((x>y &&  x<z) || (x<y && x>z)){
            System.out.println("x is the median value");
        }else if ((y<x && y>z) || (y>x && y<z)){
            System.out.println("y is the median value");
        }else{
            System.out.println("z is the median value");
        }

    }
}
