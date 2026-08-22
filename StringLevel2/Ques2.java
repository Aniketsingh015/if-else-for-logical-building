

public class Ques2 {

    public static void main(String[] args) {
        String s="Aeloo World";
        int digitCount=0;
        int letterCount=0;
        int specialCharacter=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                letterCount++;
            }else if(Character.isDigit(c)){
                digitCount++;
            }else{
                specialCharacter++;
            }
        
    }
    System.out.println(digitCount);
        System.out.println(letterCount);
        System.out.println(specialCharacter);
}
}


