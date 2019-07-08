// Uses the Trie implementation in implement-trie-prefix-tree.java
class Solution {
    public String longestWord(String[] words) {
        // Sort words
        Arrays.sort(words);
        Trie trie;
        String result = "";
        for (int i = 0; i < words.length; i++) {
            // Insert each word in words into trie except for the current word
            trie = new Trie();
            for (int j = 0; j < i; j++) {
                if (!words[j].equals(words[i])) {
                    trie.insert(words[j]);
                }
            }
            // Check if each substring of word in trie
            int counter = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (trie.search(words[i].substring(0, j))) {
                    counter++;
                } else {
                    continue;
                }
            }
            // Check if current word is valid and whether result should be updated
            if (counter >= words[i].length() - 1 && words[i].length() > result.length()) {
                result = words[i];
            }
        }
        
        return result;
    }
}

