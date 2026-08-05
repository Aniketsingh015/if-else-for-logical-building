
// Check if a number is a palindrome using recursion.
public class Ques3 {

    public static int reverseNumber(int n, int reverse){
        if(n==0)return reverse;
        int digit=n%10;
        reverse=reverse*10+digit;
        return reverseNumber(n/10, reverse);
    }

    public static boolean palindrome(int N){
        int reversed = reverseNumber(N,0);// the value which you got cannot be compared directly we have to store in variable
        return N == reversed;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(123 ));
    }
}
