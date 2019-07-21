class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(n, list, "", 0, 0);
        return list;
    }
    
    public void generateParenthesis(int n, List<String> list, String current, int opens, int closes) {
        // If current string is done being built
        if (current.length() == n * 2) {
            list.add(current);
        }
        
        // If we have not yet added n open parentheses
        if (opens < n) {
            generateParenthesis(n, list, current + "(", opens + 1, closes);
        }
        
        // If there is not yet a close parenthesis for each open parenthesis
        if (closes < opens) {
            generateParenthesis(n, list, current + ")", opens, closes + 1);
        }
    }
}