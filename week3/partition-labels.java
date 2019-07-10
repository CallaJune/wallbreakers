class Solution {
    public List<Integer> partitionLabels(String S) {
        // Create a hashmap with each letter and the index
        // at which it was last seen
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            lastSeen.put(S.charAt(i), i);
        }
        List<Integer> result = new ArrayList<>();
        // Set pointers for the start and end of current partition tracked
        int p1 = 0;
        int p2 = 0;
        // Iterate through S
        for (int i = 0; i < S.length(); i++) {
            // If current char appears after current partition end, 
            // expand partition
            if (lastSeen.get(S.charAt(i)) >= lastSeen.get(S.charAt(p2))) {
                p2 = lastSeen.get(S.charAt(i));
            }
            // Check if we have reached end of partition
            if (i == p2) {
                result.add(p2 - p1 + 1);
                p1 = p2 + 1;
            }
        }
        return result;
    }
}