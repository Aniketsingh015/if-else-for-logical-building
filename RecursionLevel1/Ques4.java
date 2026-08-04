public class Ques4 {
    public static void printOdd(int i,int n){
        if(i>n)return;
        if(i%2!=0)System.out.print(i);
        printOdd(i+1,n);
    }
    public static void main(String[] args) {
        printOdd(1,10);
    }
}
