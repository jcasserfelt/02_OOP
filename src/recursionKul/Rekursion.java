package recursionKul;

public class Rekursion {

    Rekursion() {

    }

    static String reverseString(String input) {
        if (input.isEmpty()) {
            return "";
        }

        return reverseString(input.substring(1) + input.charAt(0));
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String rev = reverseString(s1);
        System.out.printf("%s \t %s", s1, rev);
    }
}