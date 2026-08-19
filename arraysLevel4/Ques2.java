import java.util.*;


public class Ques2 {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8};
        int arr2[]={4,6,8,2};
        boolean flag=true;

        if(arr1.length!=arr2.length){
            flag=false;
        }else{
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i=0;
            int n=arr1.length;
            while(i<n){
                if(arr1[i]!=arr2[i]){
                    flag=false;
                    break;
                }
                i++;
            }
            if(flag){
                System.out.println("have same element");
            }else{
                System.out.println("not have same element");
            }

        }
    

        


    }
}
