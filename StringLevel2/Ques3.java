
public class Ques3 {
    public static void main(String[] args) {
        String s="Hello World";
        int lowercase=0;
        int uppercase=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                lowercase++;
            }else if(Character.isUpperCase(c)){
                uppercase++;
            }
        }
        System.out.println(lowercase);
        System.out.println(uppercase);
    }
}
