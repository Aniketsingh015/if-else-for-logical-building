
import java.util.Scanner;

// question:Take three side & check whether it can form a triangle or not

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b >c && a + c >b && b + c >a){
            System.out.println("It can form a triangle");
        } else {
            System.out.println("It cannot form a triangle");
        }
        sc.close();//we should close the scanner to avoid resource leak.What is resource
        //  leak? A resource leak 
        // occurs when a program does not release resources
        //  it has acquired, such as memory, file handles, or network connections.
        //  This can lead to performance issues and eventually cause 
        // the program to crash or behave unpredictably. Closing the scanner ensures 
        // that the underlying input stream is properly released and prevents potential resource leaks.
    }
}
