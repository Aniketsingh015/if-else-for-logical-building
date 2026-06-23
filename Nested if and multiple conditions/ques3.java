// Ques:Take marks (0-100) and print the grade according to the following criteria:
// 90-100: A
// 80-89: B
// 70-79: C     
// 60-69: D
// 0-59: F
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks (0-100):");
        int marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade: A");
        }else if(marks>=80 && marks<90){
            System.out.println("Grade: B");
        }else if(marks>=70 && marks<80){
            System.out.println("Grade: C");
        }else if(marks>=60 && marks<70){
            System.out.println("Grade: D");
        }else if(marks>=0 && marks<60){
            System.out.println("Grade: F");
        }else{
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }
    }
}
