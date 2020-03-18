class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        for (String op : ops) {
            if (isInteger(op)) {
                // Push integer onto stack, adding score
                Integer i = Integer.parseInt(op);
                s.push(i);
            } else if (op.equals("C")) {
                // Pop last item from stack, canceling score
                s.pop();
            } else if (op.equals("D")) {
                // Push twice the value of the last score
                int i = s.peek();
                s.push(i * 2);
            } else if (op.equals("+")) {
                // Add last two items together and push them onto the stack
                int i = s.pop();
                int j = s.pop();
                s.push(j);
                s.push(i);
                s.push(i + j);
            }
        }
        // Generate sum
        int sum = 0;
        while (!s.empty()) {
            sum += s.pop();
        }
        return sum;
    }
    
    // Return true if s is an integer
    public boolean isInteger(String s) {
        boolean isValidInteger = false;
        try {
            Integer.parseInt(s);
            isValidInteger = true;
        } catch (NumberFormatException ex) {}
        return isValidInteger;
   }
}