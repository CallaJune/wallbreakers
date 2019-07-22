class Solution {
    public void solveSudoku(char[][] board) {
        boolean[][] cols = new boolean[9][9];
        boolean[][] rows = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') {
                    continue;
                }

                int val = board[i][j] - '0' - 1;
                int k = i / 3 * 3 + j / 3;

                rows[i][val] = true;
                cols[j][val] = true;
                blocks[k][val] = true;
            }
        }

        solveSudoku(board, cols, rows, blocks);
    }

    public boolean solveSudoku(char[][] board, boolean[][] cols, boolean[][] rows, boolean[][] blocks){

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    int k = i / 3 * 3 + j / 3;
                    for(int l = 0; l < 9; l++){
                        if(!cols[j][l] && !rows[i][l] && !blocks[k][l]){
                            rows[i][l] = cols[j][l] = blocks[k][l] = true;
                            board[i][j] = (char) ('0' + 1 + l);
                            // If we keep going, will the board still be valid
                            if(solveSudoku(board, cols, rows, blocks)) {
                                return true;
                            }
                            rows[i][l] = cols[j][l] = blocks[k][l] = false;
                            board[i][j] = '.';                            
                        }
                    }
                    // Backtrack because board is not valid
                    return false;
                }        		
            }
        }
        return true;
    }
}