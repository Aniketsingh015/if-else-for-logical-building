// Print the corresponding century of a year.
// year 2000 belongs to 20th century
// year 2001 belongs to 21st century
// year 2024 belongs to 21st century
// year 1900 belongs to 19th century-here if divided by 100 it will give 19 but it belongs to 19th century 
// year 1901 belongs to 20th century-if not divisible by100 then we will add 1 to the quotient of year/100
import java.util.*;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if(year % 100 ==0){
            System.out.println("Century = "+year/100);
        }
        else{
            System.out.println("Century = "+(year/100+1));

        }
    }
}
