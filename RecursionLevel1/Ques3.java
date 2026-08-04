public class Ques3 {

    public static void printEven(int i,int n){
        if(i>n)return;
        if(i%2==0)System.out.print(i);
        printEven(i+1,n);
    }
    public static void main(String[] args) {
        printEven(1,10);
    }
}
