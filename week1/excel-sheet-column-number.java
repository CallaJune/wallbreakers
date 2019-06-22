class Solution {
    public int titleToNumber(String s) {
        int col = 0;
        int mul = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            col += ((int) s.charAt(i) - 64) * Math.pow(26, mul);
            mul++;
        }
        return col;
    }
}