class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        // Track position in s
        int p1 = 0;
        // Track position in t
        int p2 = 0;
        
        // Iterate over each index in t
        while (p2 < t.length()) {
            // If current position in s found, search for next index in s
            if (t.charAt(p2) == s.charAt(p1)) {
                p1++;
                // If all characters in s have been found, return true
                if (p1 == s.length()) {
                    return true;
                }
            }
            p2++;
        }
        return false;
    }
}