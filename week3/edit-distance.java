class Solution {
    public int minDistance(String word1, String word2) {
        //return dynamicProgramming(word1, word2);
        return recursive(word1, word2);
    }
    
    public int recursive(String word1, String word2) {
        int[][] table = new int[word1.length()][word2.length()];
        return recursive(table, word1, word2, 0, 0);
    }
    
    public int recursive(int[][] table, String word1, String word2, int i, int j) {
        if (i == word1.length()) {
            return word2.length() - j;
        }
        
        if (j == word2.length()) {
            return word1.length() - i;
        }
        
        if (table[i][j] > 0) {
            return table[i][j];
        }
        
        int result;
        
        if (word1.charAt(i) == word2.charAt(j)) {
            result = recursive(table, word1, word2, i + 1, j + 1);
        } else {
            // Replace the character
            result = 1 + recursive(table, word1, word2, i + 1, j + 1);
            
            // Delete character from word1
            result = Math.min(result, 1 + recursive(table, word1, word2, i + 1, j));
            
            // Delete character from word2
            result = Math.min(result, 1 + recursive(table, word1, word2, i, j + 1));
        }
        
        table[i][j] = result;
        return result;
    }

    public int dynamicProgramming(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        
        // If one word is empty, return the size of the other
        if (w1 * w2 == 0) {
            if (w1 == 0) {
                return w2;
            } else {
                return w1;
            }
        }

        int[][] matrix = new int[w1 + 1][w2 + 1];

        // Initialize values of matrix
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = i;
        }
        
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = j;
        }
        
        // Iterate over matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                // If character is the same in both words
                // use the last solution's value
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1];
                }
                // Otherwise, take the minimum of deleting it, 
                // shifting it, or adding it
                else {
                    matrix[i][j] = 1 + Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1]));
                }
            }
        }
        return matrix[w1][w2];
    }
}