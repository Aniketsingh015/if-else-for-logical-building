// Count how many elements are positive, negative, or zero.
public class Ques6 {
  public static void main(String[] args) {
      int countZero=0;
      int countPositive=0;
      int countNegative=0;

      int arr[]= {2,4,6,8,-9,-10,0};
      for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            countPositive++;
        }else if(arr[i]==0){
            countZero++;
        }else{
            countNegative++;
        }
        
      }
      System.out.println(countNegative);
        System.out.println(countPositive);
        System.out.println(countZero);
  }  
}
