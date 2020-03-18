class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] parr = p.toCharArray();
        Arrays.sort(parr);
        int p1 = 0;
        int p2 = p.length();
        List<Integer> result = new ArrayList<Integer>();
        if (s.length() < p.length()) {
            return result;
        }
        while (p2 <= s.length()) {
            // Put substring in char array
            char[] sarr = s.substring(p1, p2).toCharArray();
            Arrays.sort(sarr);
            // Compare to parr, if equal, add p1 to list
            if (Arrays.equals(sarr, parr)) {
                result.add(p1);
            }
            p1++;
            p2++;
        }
        return result;
    }
}