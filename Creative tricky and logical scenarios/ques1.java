// Check whether a point lies on X-axis, Y-axis, or Origin.
import java.util.Scanner;
public class ques1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin");
        } else if (x == 0) {
            System.out.println("Point lies on Y-axis");
        } else if (y == 0) {
            System.out.println("Point lies on X-axis");
        } else {
            System.out.println("Point does not lie on any axis");
        }
    }
}
    

