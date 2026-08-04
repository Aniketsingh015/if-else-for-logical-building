public class Ques6 {
    public static int factorial(int n,int fact){
        if(n==0)return fact;
        fact*=n;
        return factorial(n-1,fact);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5,1));
    }
}
