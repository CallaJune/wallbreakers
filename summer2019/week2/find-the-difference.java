// Uses the multiset class in Multiset.java
class Solution {
    public char findTheDifference(String s, String t) {
        // Add characters of each string to multiset
        Multiset<Character> sms = new Multiset<>();
        for (int i = 0; i < s.length(); i++) {
            sms.add(s.charAt(i));
        }
        Multiset<Character> tms = new Multiset<>();
        for (int i = 0; i < t.length(); i++) {
            tms.add(t.charAt(i));
        }
        // If one multiset has an extra entry, return the extra key
        if (sms.elementSet().size() > tms.elementSet().size()) {
            return findExtraKey(sms, tms);
        } else if (tms.elementSet().size() > sms.elementSet().size()) {
            return findExtraKey(tms, sms);
        }
        
        // Both multisets contain the same characters
        // Return value that is different
        for (Character c : sms.elementSet()) {
            if (sms.count(c) != tms.count(c)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Difference does not exist");
    }
    
    public char findExtraKey(Multiset<Character> larger, Multiset<Character> smaller) {
        for (Character c : larger.elementSet()) {
            if (!smaller.contains(c)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Difference does not exist");
    }
}