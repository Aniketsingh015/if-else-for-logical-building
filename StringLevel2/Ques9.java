public class Ques9 {
    public static void main(String[] args) {
        String s = "apple and orange";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char v = Character.toLowerCase(s.charAt(i));

            if ((i == 0 || s.charAt(i - 1) == ' ') &&
                (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')) {
                count++;
            }
        }

        System.out.println(count);
    }
}