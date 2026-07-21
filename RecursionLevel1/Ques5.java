public class Ques5 {

    public static int printSumofNatural(int n){
        
        if(n==0){
            return 0;
        }

        return n+ printSumofNatural(n-1);
        
        
        

        
    }
    public static void main(String[] args) {
        
        System.out.println(printSumofNatural(20));
    }
}
