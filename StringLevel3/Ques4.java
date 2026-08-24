// Check whether a string is a palindrome.

public class Ques4 {
    public static void main(String[] args) {
        String s="abccba";
        boolean flag=true;

        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;
        }

        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        
    }
}
