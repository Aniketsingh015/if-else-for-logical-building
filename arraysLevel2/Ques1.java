// Input an element x — check if it exists in the array.
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int array[]={
            2,4,6,8,9,7};

        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                flag=true;
            }
        }    

        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        
    }
}
