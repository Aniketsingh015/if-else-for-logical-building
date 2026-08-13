// Find the index of the maximum element.

public class Ques8 {
   public static void main(String[] args) {
       int arr[]={2,6,4,8};
       int maxIndex=0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]>arr[maxIndex]){
            maxIndex=i;
           }

       }

       System.out.println(maxIndex);


   } 
}
