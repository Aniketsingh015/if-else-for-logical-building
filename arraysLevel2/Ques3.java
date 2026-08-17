// Find the first occurrence of a given number.
public class Ques3 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,7,6};
        int x=6;
        int indx=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                indx=i;
                break;
            }
        }
        System.out.println(indx);
    }
}
