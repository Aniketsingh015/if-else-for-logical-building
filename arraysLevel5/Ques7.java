

public class Ques7 {
    public static void main(String[] args) {
        int arr[]={1,5,3,7,2};
        int k=8;
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
