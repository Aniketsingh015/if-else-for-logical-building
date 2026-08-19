
public class Ques4 {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8,9,3};
        int arr2[]={3,4,5,1,7,0};
        int n=arr1.length;
        int m=arr2.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]!=arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
