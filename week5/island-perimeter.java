class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        if (rows < 1) {
            return 0;
        }
        int cols = grid[0].length;
        int per = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 1) {
                    continue;
                }
                // Check if on edge
                if (i == 0) {
                    per++;
                }
                if (i == rows - 1) {
                    per++;
                }
                if (j == 0) {
                    per++;
                }
                if (j == cols - 1) {
                    per++;
                }
                // Check right, left, up, down
                if (i + 1 < rows && grid[i + 1][j] == 0) {
                    per++;
                }
                if (i - 1 >= 0 && grid[i - 1][j] == 0) {
                    per++;
                }
                if (j + 1 < cols && grid[i][j + 1] == 0) {
                    per++;
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 0) {
                    per++;
                }
            }
        }
        return per;
    }
}