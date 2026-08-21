import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;

        s=s.trim();
        for(int i=1;i<s.length();i++){

        if(s.charAt(i)==' ' && s.charAt(i-1)!=' '){
            count++;
        }
    }
    System.out.println(count);
}
}
