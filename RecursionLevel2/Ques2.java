

// Reverse a number recursively.

public class Ques2 {

    public static int reverseNumber(int n, int reverse){
        if(n==0)return reverse;
        int digit=n%10;
        reverse=reverse*10+digit;
        return reverseNumber(n/10, reverse);
    }
    public static void main(String[] args) {
       System.out.println(reverseNumber(1234,0));
    }
}
