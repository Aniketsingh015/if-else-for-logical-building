
public class Ques1 {
    public static int countDigits(int n, int count){
        if(n==0)return count;
        count+=1;
        return countDigits(n/10, count);
    } 
    public static void main(String[] args) {
        System.out.println(countDigits(1234,0));
    }
}
