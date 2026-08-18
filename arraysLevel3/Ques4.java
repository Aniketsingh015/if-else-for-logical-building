import java.util.Arrays;

public class Ques4 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
