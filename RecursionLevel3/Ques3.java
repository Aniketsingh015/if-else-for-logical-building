// Print a triangle of stars recursively (top-down).

public class Ques3 {
    public static void printStars(int n){
        if(n==0)return;
        System.out.print('*');
        printStars(n-1);
    }

    public static void countRows(int i ,int n){
        if(i>n)return;
        printStars(i);
        System.out.println();
        countRows(i+1,n);
    }
    public static void main(String[] args) {
        countRows(1,5);
    }
}
