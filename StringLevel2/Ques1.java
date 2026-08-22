

public class Ques1 {
    public static void main(String[] args) {
        String s="Aeloo World";
        int vowelCount=0;
        int consonatCount=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            c= Character.toLowerCase(c);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelCount++;
            }else if(Character.isLetter(c)){
                consonatCount++;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonatCount);
    }
}
