class Solution {
    public String frequencySort(String s) {
        Multiset<Character> ms = new Multiset<>();
        for (int i = 0; i < s.length(); i++) {
            ms.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (ms.size() > 0) {
            // Get the most frequent character
            Character max_char = ' ';
            int max_count = 0;
            for (Character c : ms.elementSet()) {
                if (ms.count(c) > max_count) {
                    max_char = c;
                    max_count = ms.count(c);
                }
            }
            // Add it to string, remove from ms
            for (int i = 0; i < max_count; i++) {
                sb.append(max_char);
                ms.remove(max_char);
            }
        }
        return sb.toString();
    }
}