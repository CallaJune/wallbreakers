class Solution {
    public String reverseVowels(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        
        char[] sb = s.toCharArray();
        
        while (lo < hi) {
            if (!isVowel(sb[lo])) {
                lo++;
                continue;
            }
            if (!isVowel(sb[hi])) {
                hi--;
                continue;
            }
            char temp = sb[lo];
            sb[lo] = sb[hi];
            sb[hi] = temp;
            hi--;
            lo++;
        }
        return new String(sb);
    }
    
    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}