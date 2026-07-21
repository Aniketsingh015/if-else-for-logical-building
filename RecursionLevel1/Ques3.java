// 
public class Ques3{

    public static void printEven(int n){
        if(n==0){
            return;
        }
        printEven(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        
        printEven(20);
    }
} 