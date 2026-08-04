public class Ques1 {
    public static void printHelper(int i,int n){
        if(i>n)return;
        System.out.print(i);
        printHelper(i+1, n-1);
    }
    public static void main(String[] args) {
        printHelper(1,10);
    }
}
