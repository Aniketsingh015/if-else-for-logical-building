

public class Ques3 {
   public static void main(String[] args) {
       String s="aniket";
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            c='*';
            sb.append(c);
        }else{
            sb.append(c);
        }
       }
       System.out.println(sb.toString());
   } 
}
