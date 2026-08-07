// Question 9: Print sum of series 1+2+3+...+n recursively, displaying each step.

public class Ques9 {

    public static void printSum(int i,int n,int sum){
        if(i>n)return;
        sum+=i;
        System.out.println(sum);
        printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
