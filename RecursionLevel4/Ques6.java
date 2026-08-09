public class Ques6 {

    static String removeChar(String s) {
    if (s.length() == 0) return "";
    if (s.charAt(0) == 'a') {
        return removeChar(s.substring(1));
    } else {
        return s.charAt(0) + removeChar(s.substring(1));
    }
}
    public static void main(String[] args) {
        System.out.println(removeChar("axe"));
    }
}
