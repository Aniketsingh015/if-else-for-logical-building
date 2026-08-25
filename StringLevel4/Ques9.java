
public class Ques9 {
    public static void main(String[] args) {
        String s = "Aniket Singh";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}