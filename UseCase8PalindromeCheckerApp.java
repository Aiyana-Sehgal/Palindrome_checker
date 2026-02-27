import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "level";
        input = input.toLowerCase();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()){
            list.add(c);
        }
        boolean isPalindrome = false;
        while(list.size() > 1){
            char f = list.remove();
            char l = list.remove(list.size() - 1);
            if (f == l) {
                isPalindrome = true;
            }
            else{
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
