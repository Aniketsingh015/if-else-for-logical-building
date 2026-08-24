// Reverse a string without using built-in reverse.

public class Ques1 {
    public static void main(String[] args) {
        String str="aniket";
        StringBuilder sb=new StringBuilder();
        

        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            sb.append(c);
        }
        System.out.println(sb.toString());
        

    }
}
