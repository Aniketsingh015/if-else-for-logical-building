
public class Ques8 {

    public static void main(String[] args) {
        int arr1[]={2,4,5,6,7};
        int arr2[]={2,4,5,6,7};
        int product=1;

        int i=0;
        int n=arr1.length;
        int m=arr2.length;
        if(m==n){
            while(i<n){
            product=arr1[i] * arr2[i];
            System.out.println(product);
            i++;
        }

        }else{
            System.out.println("the length is not equal ");
        }
        

    }
}


