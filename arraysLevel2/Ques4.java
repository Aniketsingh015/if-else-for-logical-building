// Find the last occurrence of a given number.
public class Ques4 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,7,6};
        int x=6;
        int indx=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                indx=i;
                
            }
        }
        if(indx==-1){
            System.out.println("value not found");
        }else{
            System.out.println(indx);
        }
    }
}
