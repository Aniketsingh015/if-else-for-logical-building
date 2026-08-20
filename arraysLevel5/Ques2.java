

public class Ques2 {

    public static void main(String[] args) {
        int arr[]={50,30,20,10};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                System.out.println(" sorted in ascending");
            }
        }
        System.out.println("sorted in descending");
    }
}


