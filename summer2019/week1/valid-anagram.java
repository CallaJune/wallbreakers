class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sFreqs = new HashMap<>();
        populateFrequencyMap(sFreqs, s);
        HashMap<Character, Integer> tFreqs = new HashMap<>();
        populateFrequencyMap(tFreqs, t);
        return sFreqs.equals(tFreqs);
    }
    
    public void populateFrequencyMap(HashMap<Character, Integer> map, String string) {
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }
}