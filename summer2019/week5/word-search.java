class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null) {
            return false;   
        }
        // Created a parallel 2D array of booleans, all contents initially false
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // If we find the first character of the word, do a depth first search
                if (board[i][j] == word.charAt(0) && exist(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean exist(char[][] board, boolean[][] visited, int i, int j, String word, int count) {
        // If the word has been found
        if (word.length() == count) {
            return true;
        } 
        // Check if out of bounds
        if (i > board.length - 1 || i < 0 || j > board[0].length - 1 || j < 0 || count > word.length()) {
            return false;
        }
        
        // If we are heading in a bad direction, return false and backtrack
        if (word.charAt(count) != board[i][j]) {
            return false;
        }
        
        // Check if already visited
        if (visited[i][j]) {
            return false;
        }
        
        // Visit it
        visited[i][j] = true;
        
        // Up
        if (exist(board, visited, i - 1, j, word, count + 1)) {
            return true;
        }
        // Down
        if (exist(board, visited, i + 1, j, word, count + 1)) {
            return true;
        }
        // Left
        if (exist(board, visited, i, j - 1, word, count + 1)) {
            return true;
        }
        // Right
        if (exist(board, visited, i, j + 1, word, count + 1)) {
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
}