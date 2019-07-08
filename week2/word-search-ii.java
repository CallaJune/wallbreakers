// Uses the Trie implementation in implement-trie-prefix-tree.java
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> wordSet = new HashSet<>();
        
        // Build trie from all words
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, trie.root, wordSet, "");
            }
        }
        
        List<String> result = new ArrayList<String>();
        for (String s : wordSet) {
            result.add(s);
        }
        
        return result;
    }
    
    public void dfs(char[][] board, int i, int j, TrieNode p, Set<String> result, String s) {
        char c = board[i][j];
        if (c == '-' || p.links[c - 'a'] == null) {
            return;
        }
        p = p.links[c - 'a'];
        
        // If word is found
        if (p.isTermination()) {
            result.add(s + c);
        }

        board[i][j] = '-';
        if (i > 0) {
            dfs(board, i - 1, j, p, result, s + c); 
        }
        if (j > 0) {
            dfs(board, i, j - 1, p, result, s + c);
        }
        if (i < board.length - 1) {
            dfs(board, i + 1, j, p, result, s + c); 
        }
        if (j < board[0].length - 1) {
            dfs(board, i, j + 1, p, result, s + c); 
        }
        board[i][j] = c;
    }
}