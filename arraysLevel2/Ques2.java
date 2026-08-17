// Count how many times a given element appears.

class Ques2{
    public static void main(String[] args) {
        int counter=0;
        int x=2;
        int arr[]={2,2,4,2,4,2,4};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                counter++;
            }
        }
        System.out.println(counter);
    }
}