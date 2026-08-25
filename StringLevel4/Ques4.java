

public class Ques4 {
   public static void main(String[] args) {
       String s="I am Raju";

       StringBuilder sb= new StringBuilder();

       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c==' '){
            c='_';
            sb.append(c);
        }else{
            sb.append(c);
        }
       }
       System.out.println(sb.toString());
   } 
}
