// Print the middle character(s) of a string.

public class Ques6 {
    public static void main(String[] args) {
        String s="hell";
        int middle=s.length()/2;

        if(s.length()%2==0){//in even we dont know which element to take as middle so take both
            System.out.println(s.charAt(middle));
             System.out.println(s.charAt(middle-1));

        }else{
            System.out.println(s.charAt(middle));
        }
    }
}
