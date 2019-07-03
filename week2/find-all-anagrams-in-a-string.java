class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Multiset<Character> pset = multisetFromString(p);
        int p1 = 0;
        int p2 = p.length();
        List<Integer> result = new ArrayList<Integer>();
        if (s.length() < p.length()) {
            return result;
        }
        // Put substring in multiset
        String substring = s.substring(p1, p2);
        Multiset<Character> subset = multisetFromString(substring);
        while (p2 <= s.length()) {
            // Compare to pset, if equal, add p1 to list
            if (subset.equals(pset)) {
                result.add(p1);
            }
            // Shift substring that subset covers
            subset.remove(s.charAt(p1));
            if (p2 < s.length()) {
                subset.add(s.charAt(p2));
            }
            p1++;
            p2++;
        }
        return result;
    }
    
    public Multiset<Character> multisetFromString(String s) {
        Multiset<Character> multiset = new Multiset<>();
        for (char c : s.toCharArray()) {
            multiset.add(c);
        }
        return multiset;
    }
}