

public class Ques3 {
    public static void main(String[] args) {
        int arr[]={20,50,100,60,70,80};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]<largest){
                secondlargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);

    }
}
