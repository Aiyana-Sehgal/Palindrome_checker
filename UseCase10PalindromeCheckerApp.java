public class UseCase10PalindromeCheckerApp {
    public static boolean check(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return check(s.substring(1, s.length() - 1));
        }
        return false;
    }
    public static void main(String[] args){
        String text = "A man a plan a canal Panama";
        text = text.toLowerCase();
        String noSpaces = text.replaceAll("\\s", "");
        System.out.println(check(noSpaces));

    }

}
