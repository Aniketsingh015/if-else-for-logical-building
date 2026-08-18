import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,6,8};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
        System.out.println(Arrays.toString(arr));
    }
}
