public class Ques5 {

    static String replaceChar(String s) {
    if (s.length() == 0) return "";
    if (s.charAt(0) == 'a') {
        return 'x' + replaceChar(s.substring(1));
    } else {
        return s.charAt(0) + replaceChar(s.substring(1));
    }
}
    public static void main(String[] args) {
        System.out.println(replaceChar("anxious"));
    }
}
