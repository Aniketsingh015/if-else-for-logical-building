// Find the count of prime numbers in the array.

public class Ques7 {
    public static void main(String[] args) {
        int arr[]={2,1,4,5,6,7,9,13};
        int count=0;
        
        
     for( int i=0;i<arr.length;i++){
        if(arr[i]==1){
            continue;
        }
        if(arr[i]==2){
            count++;
            continue;
        }
      boolean isPrime=true;
       for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);  
        
}
}
