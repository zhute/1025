public class StringMethods {
    private static boolean isNumber(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDefined(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String c="12s2412";
            isNumber(c);
    }
}
