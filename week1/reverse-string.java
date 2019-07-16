class Solution {
    public void reverseString(char[] s) {
        // Create pointers at each end of string
        int hi = s.length - 1;
        int lo = 0;

        // Move pointers toward center at an equal rate
        while (hi > lo) {
            // Switch characters
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            hi--;
            lo++;
        }
    }
}