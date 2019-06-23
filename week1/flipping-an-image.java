class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rowSize = A.length;
        int colSize = A[0].length;
        // Reverse each row, A[i]
        for (int i = 0; i < rowSize; i++) {
            int lo = 0;
            int hi = rowSize - 1;
            while (lo < hi) {
                int temp = A[i][lo];
                A[i][lo] = A[i][hi];
                A[i][hi] = temp;
                lo++;
                hi--;
            }
        }
        // Invert each item in the matrix
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                A[i][j] ^= 1;
            }
        }
        return A;
    }
}