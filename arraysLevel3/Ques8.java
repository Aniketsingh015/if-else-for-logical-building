

import java.util.Arrays;

public class Ques8 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int n=arr.length-1;
        int temp=arr[n];
        int i=n-1;
        
        while(i>=0){
            arr[i+1]=arr[i];
            i--;
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
        
    }
}
