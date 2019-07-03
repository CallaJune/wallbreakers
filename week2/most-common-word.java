// Uses the multiset class in Multiset.java
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Add banned words to hashset so they can be accessed in constant time
        HashSet<String> bannedWords = new HashSet<>();
        for (String s : banned) {
            bannedWords.add(s);
        }
        // Add words in paragraph to multiset if not banned
        Multiset<String> paragraphWords = new Multiset<>();
        // Split paragraph by any non-alphanumeric occurring one or more times
        String[] words = paragraph.split("\\W+");
        for (String word : words) {
            word = word.replaceAll("[^A-Za-z]+", "").toLowerCase();
            if (!bannedWords.contains(word)) {
                paragraphWords.add(word);
            }
        }
        // Find word with highest count
        String mostCommonWord = "";
        int maxOccurrences = 0;
        for (String word : paragraphWords.elementSet()) {
            if (paragraphWords.count(word) > maxOccurrences) {
                mostCommonWord = word;
                maxOccurrences = paragraphWords.count(word);
            }
        }
        return mostCommonWord;
    }
}