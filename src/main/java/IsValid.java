import java.util.*;

/**
 * leetcode 20. 有效的括号 https://leetcode.cn/problems/valid-parentheses/description/
 */
public class IsValid {

    static final List<Character> leftKuoHao = Arrays.asList('(', '[', '{');
    static final List<Character> rightKuoHao = Arrays.asList( ')', ']', '}');
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            //左括号入栈
            if (leftKuoHao.contains(c)) {
                stack.push(c);
            }
            //右括号出栈
            if (rightKuoHao.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (pop == '(' ) {
                    if (c != ')') {
                        return false;
                    }
                    continue;
                }
                if (pop == '[') {
                    if (c != ']') {
                        return false;
                    }
                    continue;
                }
                if (pop == '{') {
                    if (c != '}') {
                        return false;
                    }
                    continue;
                }
            }
        }

        return stack.isEmpty();
    }
}
