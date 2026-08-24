// Check if two strings are the reverse of each other.
public class Ques5 {
    public static void main(String[] args) {
        String s="abc";
        String v="cba";

        int left=0;
        int right=v.length()-1;
        boolean flag=true;

        if(s.length()!=v.length()){
            flag=false;
            
        }else{
            while(left<s.length()){
                if(s.charAt(left)!=v.charAt(right)){
                    flag=false;
                    break;
                }

                left++;
                right--;
        }
        }

        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        
    }
}
