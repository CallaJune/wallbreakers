class Trie {
    
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.containsKey(c)) {
                node.put(c, new TrieNode());
            }
            node = node.get(c);
        }
        node.setTermination();
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.containsKey(c)) {
                node = node.get(c);
            } else {
                return false;
            }
        }
        return node.isTermination();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.containsKey(c)) {
                node = node.get(c);
            } else {
                return false;
            }
        }
        return true;
    }
}

class TrieNode {
    // Array holding the children of current TrieNode in alphabetical order
    TrieNode[] links;
    final int r = 26;
    boolean isTermination;
    
    public TrieNode() {
        links = new TrieNode[r];
    }
    
    public boolean containsKey(char c) {
        return links[c - 'a'] != null;
    }
    
    public TrieNode get(char c) {
        return links[c - 'a'];
    }
    
    public void put(char c, TrieNode node) {
        links[c - 'a'] = node;
    }
    
    public void setTermination() {
        isTermination = true;
    }
    
    public boolean isTermination() {
        return isTermination;
    }
}