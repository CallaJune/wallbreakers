class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        // The score is initially set to 0
        stack.push(0);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                // Add a new depth score and set it to 0
                stack.push((0));
            } else {
                int top = stack.pop();
                int underTop = stack.pop();
                // Add two times the score of the previous depth
                stack.push(underTop + Math.max(2 * top, 1));
            }
        }
        return stack.pop();
    }
}