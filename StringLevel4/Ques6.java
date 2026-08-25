

public class Ques6 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            boolean alreadySeen = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    alreadySeen = true;
                    break;
                }
            }
            if (!alreadySeen) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}