import java.util.Arrays;

public class Ques9 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int left =0;
        int right=1;
        while(right<arr.length){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left=left+2;
        right=right+2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
