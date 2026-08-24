// Print the second half of the string in reverse.

public class Ques7 {
    public static void main(String[] args) {
        String s="Pudinaaaaaa";

        int middle=s.length()/2;
        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=middle;i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
