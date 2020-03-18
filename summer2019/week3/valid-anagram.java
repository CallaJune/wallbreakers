class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Sort both strings as character arrays
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        // Check whether sorted arrays are equal
        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }
}