public class Ques4 {
    public static void printOdd(int n){
        if(n==0){
            return;
        }
        printOdd(n-1);
        if(n%2!=0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        printOdd(20);
    }
}
