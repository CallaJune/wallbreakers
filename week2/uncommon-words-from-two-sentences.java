class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        populateSentenceSet(A, map1);
        populateSentenceSet(B, map2);
        
        HashSet<String> set = new HashSet<>();
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1 && !map2.containsKey(s)) {
                set.add(s);
            }
        }
        for (String s : map2.keySet()) {
            if (map2.get(s) == 1 && !map1.containsKey(s)) {
                set.add(s);
            }
        }
        String[] result = new String[set.size()];
        int i = 0;
        for (String item : set) {
            result[i] = item;
            i++;
        }
        return result;
    }
    
    public void populateSentenceSet(String sentence, HashMap<String, Integer> map) {
        String[] words = sentence.split(" ");
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
    }
}