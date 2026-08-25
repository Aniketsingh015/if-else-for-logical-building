public class Ques2 {
   public static void main(String[] args) {
       String s="I am Raju";

       StringBuilder sb= new StringBuilder();

       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c!=' '){
            sb.append(c);
        }
       }
       System.out.println(sb.toString());
   } 
}
