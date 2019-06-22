class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1)
            return "";
        // Set prefix to first string in strs
        StringBuilder prefix = new StringBuilder(strs[0]);
        for (String s : strs) {
            if (prefix.length() < 1)
                return "";
            // Truncate prefix if necessary
            if (prefix.length() > s.length()) {
                prefix.delete(s.length(), prefix.length());
            }
            // Iterate through string s until prefix differs
            for (int i = 0; i < s.length(); i++) {
                if (prefix.length() <= i || s.charAt(i) != prefix.charAt(i)) {
                    prefix.delete(i, prefix.length());
                    break;
                }
            }
        }
        return prefix.toString();
    }
}