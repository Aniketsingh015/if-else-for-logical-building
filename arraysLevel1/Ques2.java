// Find the sum of all elements in an array.

public class Ques2 {
    public static void main(String[] args) {
        int arr[]={2,5,7,9};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
