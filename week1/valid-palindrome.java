class Solution {
    public boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        
        while (lo < hi) {
            if (!isAlphanumeric(s.charAt(lo))) {
                lo++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(hi))) {
                hi--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(lo)) != Character.toLowerCase(s.charAt(hi))) {
                System.out.println(s.charAt(lo));
                System.out.println(s.charAt(hi));
                return false;
            }
            hi--;
            lo++;
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        return Character.isDigit(c) || Character.isLetter(c);
    }
}