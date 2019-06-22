class Solution {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int beg = 0;
        int end = 0;
        while (end < charArray.length + 1) {
            if (end == charArray.length || charArray[end] == ' ') {
                reverseWord(charArray, beg, end - 1);
                beg = end + 1;
                end++;
                continue;
            }
            end++;
        }
        return new String(charArray);
    }
    
    public void reverseWord(char[] s, int lo, int hi) {
        while (hi > lo) {
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            hi--;
            lo++;
        }
    }
}