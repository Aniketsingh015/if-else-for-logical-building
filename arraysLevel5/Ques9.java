
public class Ques9 {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,2,4,3};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            System.out.println(arr[i] + "=" + count);
        }
        
    }
}
