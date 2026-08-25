

public class Ques10 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = (char) (c + 1);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}