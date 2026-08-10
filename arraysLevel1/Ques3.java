// Find the average of array elements.
public class Ques3 {
    public static void main(String[] args) {
        int arr[]={2,3,5,8,9};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg=(double)sum/arr.length;
        System.out.println(avg);
    }
}
