// Reverse each word in a sentence.
// Reverse each word in a sentence.
public class Ques2 {
    public static void main(String[] args) {
        String s = "I am learning java";
        StringBuilder sb = new StringBuilder();

        String[] word = s.split(" ");

        for (int i = 0; i < word.length; i++) {
            String currentWord = word[i];

            // inner loop: reverse the letters of THIS word only
            for (int j = currentWord.length() - 1; j >= 0; j--) {
                sb.append(currentWord.charAt(j));
            }
            sb.append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}