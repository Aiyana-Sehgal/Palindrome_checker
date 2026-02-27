import java.util.LinkedList;

public class UseCase9PalindromeCheckerApp {
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
        String input = "you";
        System.out.println(check(input));



    }
}
