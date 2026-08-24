// Reverse each word in a sentence.
public class Ques2 {
    public static void main(String[] args) {
        String s= "I am learning java";
        StringBuilder sb=new StringBuilder();

        String[] word=s.split(" ");
        // this will soit the char into array as well in order

        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
