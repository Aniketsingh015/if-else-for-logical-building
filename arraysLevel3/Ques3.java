import java.util.Arrays;

public class Ques3 {
    public static void main(String[] args) {
        int arr[]={2,4,-4,-6,-8,9};

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
