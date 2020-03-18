class Solution {
    public int numJewelsInStones(String J, String S) {
        // Create a hashset of all jewels for O(1) access
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        // Iterate through S and count number of
        // characters also in set
        int numJewels = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                numJewels++;
            }
        }
        return numJewels;
    }
}