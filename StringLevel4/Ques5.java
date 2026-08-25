

public class Ques5 {
    public static void main(String[] args) {
        String s="I am 80 kg weight";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
         char c=s.charAt(i);
         if(!Character.isDigit(c) ){
            sb.append(c);
         }   
        }
        System.out.println(sb.toString());
    }
}
