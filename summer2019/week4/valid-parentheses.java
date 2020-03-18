public class Solution {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                x.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (x.empty()) {
                    return false;
                }
                if (c == ')' && x.peek() != '(' ||
                    c == '}' && x.peek() != '{' ||
                    c == ']' && x.peek() != '[') {
                    return false;
                }
                x.pop();
            }
        }
        return x.empty();
    }
}