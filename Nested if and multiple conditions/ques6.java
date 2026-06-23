// ques:check voting eligibility of a person based on age and citizenship
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your country of citizenship:(e.g., India)");
        String citizenship=sc.next();
        if(age>=18){
            if(citizenship.equalsIgnoreCase("India")){
                System.out.println("You are eligible to vote.");
            }else{
                System.out.println("You are not eligible to vote because you are not a citizen.");
            }
        }else{
            System.out.println("You are not eligible to vote because you are underage.");
        }
        sc.close();
    }
}
