// Ques:Check if an amount can be evenly divided into ₹2000, ₹500 and ₹100 notes.
import java.util.Scanner;
public class ques7 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        if (amount % 100 == 0) {
            System.out.println("Can be divided");
        } else {
            System.out.println("Cannot be divided");
        }
    }
}

