// Print a line of n stars recursively.

public class Ques1 {

    public static void printStars(int n){
        if(n==0)return;
        System.out.print('*');
        printStars(n-1);
    }
    public static void main(String[] args) {
        printStars(5);
    }
}
