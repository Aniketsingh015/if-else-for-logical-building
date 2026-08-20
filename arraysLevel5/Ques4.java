

public class Ques4 {
    public static void main(String[] args) {
        int arr[]={20,30,5,1,2,6};
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]< secondSmallest && arr[i]>smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println(secondSmallest);
        System.out.println(smallest);
    }
}
