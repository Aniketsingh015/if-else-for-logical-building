// question:if sides form a valid  triangle then check whether it is equilateral, isosceles or scalene triangle
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("It can form a triangle");
            if(a==b && b==c){
                System.out.println("It is an equilateral triangle");
            }else if(a==b || b==c || a==c){
                System.out.println("It is an isosceles triangle");
            }else{
                System.out.println("It is a scalene triangle");
            }
        }else{
            System.out.println("It is not a valid triangle");
            }
    }
    
}
