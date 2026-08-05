// Calculate the sum of first n even numbers recursively.

public class Ques8 {

    public static int sumEven(int n){
        if(n==0)return 0;
        return 2*n + sumEven(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumEven(5));
    }
}
