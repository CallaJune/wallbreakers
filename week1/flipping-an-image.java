class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rowSize = A.length;
        int colSize = A[0].length;
        for (int i = 0; i < rowSize; i++) {
            int lo = 0;
            int hi = rowSize - 1;
            while (lo <= hi) {
                int temp = A[i][lo] ^ 1;
                A[i][lo] = A[i][hi] ^ 1;
                A[i][hi] = temp;
                lo++;
                hi--;
            }
        }
        return A;
    }
}