public class Solution {
    /* Do a depth first search (dfs) on each index of matrix,
     * following it in each direction so long as conditions are met
     * (path increases) and backtracking when conditions are no longer met.
     * Memoize answer in parallel matrix.
     */
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int mem[][] = new int[rows][cols];
        int maxPath = 1;
        for (int[] arr : mem){
            Arrays.fill(arr,-1);
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                dfs(matrix, mem, i, j);
                maxPath = Math.max(mem[i][j], maxPath);
            }
        }
        return maxPath;
    }
    
    public void dfs(int[][] matrix, int[][] mem, int i, int j){
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int xDirs[]={0, 0, 1, -1};
        int yDirs[]={1, -1, 0, 0};
        int max = 1;
        for (int k = 0; k < 4; k++) {
            
                int x = xDirs[k] + i;
                int y = yDirs[k] + j;
                if (x >= rows || x < 0|| y >= cols||y < 0) {
                    continue;
                }
                if (matrix[x][y] > matrix[i][j]){
                    if (mem[x][y] < 0){
                        dfs(matrix, mem, x, y);
                    }
                    max = Math.max(1 + mem[x][y], max);
                }
            
        }
        mem[i][j] = max;
    }
}