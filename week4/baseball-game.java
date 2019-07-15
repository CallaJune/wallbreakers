class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        for (String op : ops) {
            if (isInteger(op)) {
                Integer i = Integer.parseInt(op);
                s.push(i);
            } else if (op.equals("C")) {
                s.pop();
            } else if (op.equals("D")) {
                int i = s.peek();
                s.push(i * 2);
            } else if (op.equals("+")) {
                int i = s.pop();
                int j = s.pop();
                s.push(j);
                s.push(i);
                s.push(i + j);
            }
        }
        int sum = 0;
        while (!s.empty()) {
            sum += s.pop();
        }
        return sum;
    }
    
    public boolean isInteger(String s) {
        boolean isValidInteger = false;
        try {
            Integer.parseInt(s);
            isValidInteger = true;
        } catch (NumberFormatException ex) {}
        return isValidInteger;
   }
}