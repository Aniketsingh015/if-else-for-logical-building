// Check if all elements in an array are unique.
import java.util.*;
public class Ques5 {
    public static void main(String[] args) {
        int arr[]={2,4,4,6,8};
        boolean unique=true;

        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                unique=false;
                break;
            }
        }
        if(unique){
            System.out.println("elements aare unique");
        }else{
            System.out.println("elements aare not unique");
        }
    }
}
// we can also use hashset and hashmaps