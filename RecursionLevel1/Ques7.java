

public class Ques7 {

    public static double power(int x ,int n){
        if(n==0){
            return 1;

        }
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(10,5));
    }
}
