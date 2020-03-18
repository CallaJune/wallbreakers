// Uses the multiset class in Multiset.java
class Solution {
    public int firstUniqChar(String s) {
        Multiset<Character> ms = new Multiset<>();
        for (int i = 0; i < s.length(); i++) {
            ms.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (ms.count(s.charAt(i)) == 1) {
                return i;
            } 
        }
        return -1;
    }
}