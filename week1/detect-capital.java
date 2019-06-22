class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (Character.isUpperCase(word.charAt(0))) {
            return caseCheck(true, word.substring(1, word.length())) || caseCheck(false, word.substring(1, word.length()));
        } else {
            // All must be lower case
            return caseCheck(false, word.substring(1, word.length()));
        }
    }
    
    /* Assures that all characters in string 'word' are
     * all uppercase if isCapital is true, all lowercase otherwise.
     */
    public boolean caseCheck(boolean isCapital, String word) {
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c) != isCapital) {
                return false;
            }
        }
        return true;
    }
}