public class Ques10 {
    public static void main(String[] args) {
        String s = "cats and dogs chase birds";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char v = Character.toLowerCase(s.charAt(i));

            if ((i == s.length() - 1 || s.charAt(i + 1) == ' ') && v == 's') {
                count++;
            }
        }

        System.out.println(count);
    }
}