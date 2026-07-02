// Compare two dates (day and month) and find which comes first.

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day1 = sc.nextInt();

        int month1 = sc.nextInt();

        int day2 = sc.nextInt();

        int month2 = sc.nextInt();

        if (month1 < month2)

            System.out.println("First date comes first");

        else if (month2 < month1)

            System.out.println("Second date comes first");

        else {

            if (day1 < day2)

                System.out.println("First date comes first");

            else if (day2 < day1)

                System.out.println("Second date comes first");

            else

                System.out.println("Both dates are same");

        }

    }
}
