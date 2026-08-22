

public class Ques6 {
    public static void main(String[] args) {
        char c='l';
        String s="Hello World";
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
    
    
}
