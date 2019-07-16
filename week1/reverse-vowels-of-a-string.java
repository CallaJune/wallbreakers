class Solution {
    public String reverseVowels(String s) {
        // Set pointers at each end of the string
        int lo = 0;
        int hi = s.length() - 1;

        // Convert string to character array
        char[] sb = s.toCharArray();
        
        while (lo < hi) {
            // Move lo and hi pointers toward center
            if (!isVowel(sb[lo])) {
                lo++;
                continue;
            }
            if (!isVowel(sb[hi])) {
                hi--;
                continue;
            }

            // When both point to vowels, switch the vowels
            char temp = sb[lo];
            sb[lo] = sb[hi];
            sb[hi] = temp;
            hi--;
            lo++;
        }
        return new String(sb);
    }
    
    // Return true if char c is a vowel
    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}