// Find product of digits of a number recursively.

public class Ques4 {
    public static int productDigit(int N , int product){
        if(N==0)return product;
        int digit=N%10;
        product=product*digit;
        return productDigit(N/10, product);
    }
    public static void main(String[] args) {
        System.out.println(productDigit(1234,1));
    }
}
