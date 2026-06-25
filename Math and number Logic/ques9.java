// ques:Take two angles of a triangle and compute the third angle.
import java.util.Scanner;
public class ques9 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        if (angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180) {

            int angle3 = 180 - (angle1 + angle2);

            System.out.println("Third Angle = " + angle3);
        }
        else {
            System.out.println("Invalid Angles");
        }
    }
}

