

public class Ques7 {
    public static void main(String[] args) {
        int arr1[]={2,4,5,6,7};
        int arr2[]={2,4,5,6,7};
        int sum=0;

        int i=0;
        int n=arr1.length;
        int m=arr2.length;
        if(m==n){
            while(i<n){
            sum=arr1[i]+arr2[i];
            System.out.println(sum);
            i++;
        }

        }else{
            System.out.println("the length is not equal ");
        }
        

    }
}
