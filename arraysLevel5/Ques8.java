
public class Ques8 {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};
        int sum=0;
        double avg=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=(double)sum/arr.length;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
