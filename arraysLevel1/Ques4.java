// Find the maximum element in an array.

public class Ques4 {
    public static void main(String[] args) {
        int arr [] ={2,4,6,8,10};
        int maxArr=arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            maxArr=Math.max(arr[i],maxArr);

        }
        System.out.println(maxArr);
    }
}
