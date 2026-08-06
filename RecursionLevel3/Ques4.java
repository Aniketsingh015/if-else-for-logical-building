// Print a triangle of stars recursively (bottom-up).

public class Ques4 {
    public static void printStars(int n){
        if(n==0)return;
        System.out.print('*');
        printStars(n-1);
    }

    public static void countRows(int n){
        if(n==0)return;
        printStars(n);
        System.out.println();
        countRows(n-1);
    }
    public static void main(String[] args) {
        countRows(5);
    }
}
