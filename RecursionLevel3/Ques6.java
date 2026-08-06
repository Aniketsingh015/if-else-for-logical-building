// Print reverse triangle pattern recursively.

public class Ques6 {

    public static void printSpaces(int count){
        if(count==0)return;
        System.out.print(" ");
        printSpaces(count-1);
    }

    public static void printStars(int n){
        if(n==0)return;
        System.out.print("*");
        printStars(n-1);
    }

    public static void countRows(int i,int n){
        if(i>n)return;
        printSpaces(n-i);
        printStars(i);
        System.out.println( );
        countRows(i+1,n);
    
    }
    public static void main(String[] args) {
        countRows(1, 5);
    }
}
