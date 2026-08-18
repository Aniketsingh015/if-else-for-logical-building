import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6,7,8,9};
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0)count++;
        }
        int arr[]=new int [count];
        int j=0;
        for(int i=0;i<arr1.length;i++){
            
            if(arr1[i]%2==0){
                arr[j]=arr1[i];
                j++;
            
        }
    }
    System.out.println(Arrays.toString(arr));
}
}
