import java.util.*;
public class Ques9 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,1,1,2,3};
        Arrays.sort(arr1);
        int n=arr1.length;
        int count=1;
        int i=0;
        while(i<n-1){
            if(arr1[i]!=arr1[i+1]){
            count++;
        }
        i++;
        }
        int index=0;
        int [] arr2=new int[count];
        for(int j=0;j<n;j++){
            int frequency=0;
            for(int k=0;k<n;k++){
                if(arr1[j]==arr1[k]){
                    frequency++;
                }
            }
            arr2[index]=frequency;
            index++;
        }

        System.out.println(Arrays.toString(arr2));
        

    }
}
