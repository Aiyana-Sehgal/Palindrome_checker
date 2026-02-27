import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();
        boolean isPalindrome = true;
        input = input.toLowerCase();
        for(char c : input.toCharArray()){
            deque.add(c);
        }
        while(deque.size() > 1){
            char f = deque.removeFirst();
            char l = deque.removeLast();
            if (f == l){
                isPalindrome = true;
            }
            else
                isPalindrome = false;
        }
        System.out.println(isPalindrome);
    }
}