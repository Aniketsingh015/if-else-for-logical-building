// Convert a number to binary recursively.

public class Ques6 {
    public static String conversion(int n , String result){
        if(n==0)return result;
        int digit =n%2;
        result = digit + result;
        return conversion(n/2,result);

    }

    public static void main(String[] args) {
        System.out.println(conversion(13 ," "));
    }

}
