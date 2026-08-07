public class Ques8 {

    public static void printNumbers(int n,int i){
        if(i>n)return;
       
        System.out.print(i+" ");
        printNumbers(n, i+1);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        printNumbers(10,0);
    }
}
