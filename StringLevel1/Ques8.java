import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);

        if (result < 0) {
            System.out.println(s1 + " comes first");
        } else if (result > 0) {
            System.out.println(s2 + " comes first");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}