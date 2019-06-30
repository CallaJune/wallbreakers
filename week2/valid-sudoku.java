class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char n = board[i][j];
                if (n != '.' 
                    && (!set.add("r" + String.valueOf(i) + n)
                    || !set.add("c" + String.valueOf(j) + n)
                    || !set.add("b" + String.valueOf(i/3) + String.valueOf(j/3) + n))) {
                    return false;
                }
            }
        }
        return true;    
    }
}