import java.util.Arrays;

public class Ques3 {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8};
        int arr2[]={1,3,5,7};

        int sum=arr1.length+arr2.length;
        int arr3[]=new int[sum];
        int n=arr1.length;
        int i=0;
        while(i<n){
            arr3[i]=arr1[i];
            i++;
        }

        int j=0;
        while(j<n){
            arr3[j+n]=arr2[j];
            j++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
