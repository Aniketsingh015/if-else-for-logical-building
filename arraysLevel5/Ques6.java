

public class Ques6 {
    public static void main(String[] args) {
        int arr[]={20,40,30,1,50};
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int sum=0;
        int total=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }

            sum+=arr[i];
        }
        System.out.println(largest);
        System.out.println(smallest);

        total=sum-largest-smallest;
        System.out.println(total);
        

    }
}
