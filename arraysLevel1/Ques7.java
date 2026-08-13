// Count how many elements are even and odd.

public class Ques7 {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,7,8,9,10};
        int oddCount=0;
        int evenCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }else{
                evenCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
