import java.util.*;
public class Ques5 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9};
        int n=arr.length-1;
        int temp=arr[0];
        arr[0]=arr[n];
        arr[n]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
