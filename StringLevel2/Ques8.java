

public class Ques8 {
    public static void main(String[] args) {
        String s="abc";
        int count=0;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);

                if(sub.charAt(0)==(sub.charAt(sub.length()-1)))count++;
            }
        }
        System.out.println(count);
    }
}
