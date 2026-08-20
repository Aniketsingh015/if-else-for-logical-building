

public class Ques1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("not sorted in ascending");
            }
        }
        System.out.println("sorted in ascending");
    }
}
