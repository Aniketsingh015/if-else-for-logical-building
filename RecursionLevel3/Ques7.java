// Print multiplication table of n recursively.
public class Ques7 {

    public static void multiple(int n,int i){
        if(i==0)return;
        multiple(n,i-1);
        System.out.println(n + "x" + i + "=" + (n*i));
    }
    public static void main(String[] args) {
        multiple(10,10);
    }
}
