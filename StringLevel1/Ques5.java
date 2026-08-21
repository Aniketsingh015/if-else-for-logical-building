
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        // using replace function
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        // String noSpaces=s.replace(" ","");
        // System.out.println(noSpaces);
        // System.out.println(noSpaces.length());


        // using loop
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
