public class Ques2 {
    // there are diffrent approach u can do the same rather taking n as variable
    public static void printBackward(int i,int n ){
        if(i>n)return;
        printBackward(i+1, n-1);
        System.out.print(i);
    }
    public static void main(String[] args) {
        printBackward(1,10);
    }
}
