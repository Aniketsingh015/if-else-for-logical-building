// Print digits of a number in words recursively (e.g., 123 → “one two three”).

public class Ques7 {
    static String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void numInWords(int n){
        if(n==0)return ;
        int digit=n%10;
        
        numInWords(n/10);
        System.out.println(words[digit]);

    }
    public static void main(String[] args) {
        numInWords(123);
    }
}
