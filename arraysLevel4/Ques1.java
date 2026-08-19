
public class Ques1 {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8};
        int arr2[]={2,4,6,8,9};
         boolean flag=true;
        if(arr1.length!=arr2.length){
            flag=false;
        }else{
            int n=arr1.length;
            int i=0;

            while(i<n){
            if(arr1[i]!=arr2[i]){
                flag=false;
                break;
            }
            i++;
        }
        }
        
       
        
        if(flag){
            System.out.println("have same order and element");
        }else{
            System.out.println("not have same order and element");
        }
    }
}
