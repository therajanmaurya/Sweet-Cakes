import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsCharValid {

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String code) {

        // determine if the input code is valid

        Map<Character, Character> openersToClosers = new HashMap<>();
        openersToClosers.put('(', ')');
        openersToClosers.put('[', ']');
        openersToClosers.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (char s : code.toCharArray()) {
            if (stack.empty()) {
                stack.push(s);
            }  else if (!openersToClosers.containsKey(s)) {
                return stack.empty();
            } else if (openersToClosers.get(stack.peek()) == s) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }

        return stack.empty();
    }
}
