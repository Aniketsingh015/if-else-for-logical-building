import java.util.Arrays;

public class Ques7 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int temp=arr[0];
        int i=0;
        int n=arr.length-1;
        while(i<n){
            arr[i]=arr[i+1];
            i++;
        }
        arr[n]=temp;
        System.out.println(Arrays.toString(arr));
        
    }
}
