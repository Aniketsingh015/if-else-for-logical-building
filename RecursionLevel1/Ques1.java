
// print number from 1 to n

import java.util.Scanner;

public class Ques1 {

    public static void print1toN(int n){
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print1toN(n);
    }
}
