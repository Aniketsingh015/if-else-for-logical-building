public class Ques8 {
    public static void main(String[] args) {
        String s = "aaabb";
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));   // first character always kept

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}