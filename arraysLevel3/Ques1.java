import java.util.Arrays;

public class Ques1 {
   public static void main(String[] args) {
       int [] arr=new int[5];
       for (int i = 0; i < arr.length; i++) {
           arr[i]=i*i;
           
       }
       System.out.println(Arrays.toString(arr));

   } 
}
