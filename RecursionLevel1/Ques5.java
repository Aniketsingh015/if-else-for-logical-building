public class Ques5 {
    public static int sumHelper(int n){
        // if(n==0)return sum;
        // sum+=n;
        // return sumHelper(n-1, sum);
        
        if(n==0)return 0;
        return n+sumHelper(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumHelper(10));
    }
}
