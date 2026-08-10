// Find the minimum element in an array.

public class Ques5 {
    public static void main(String[] args) {
        int arr [] ={2,4,6,8,10};
        int minArr=arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            minArr=Math.min(arr[i],minArr);

        }
        System.out.println(minArr);
    }
}
