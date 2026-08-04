public class Ques10 {
    public static int printSumDigit(int n,int sum){
        if(n==0)return sum;
        sum=sum+n%10;
        return printSumDigit(n/10,sum);
    }
    public static void main(String[] args) {
        System.out.println(printSumDigit(1234,0));
    }
}
