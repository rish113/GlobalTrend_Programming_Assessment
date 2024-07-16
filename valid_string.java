import java.util.Stack;

public class valid_string {

    public boolean isValid(String s) {
        // Edge case
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }


                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        valid_string solution = new valid_string();

        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid(""));
    }
}

