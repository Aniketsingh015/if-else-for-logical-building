

public class Ques9 {
   public static int sumOdd(int n){
        if(n==0)return 0;
        return 2*n-1 + sumOdd(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOdd(5));
    }  
}
