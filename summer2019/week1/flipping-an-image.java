class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int lo = 0;
            int hi = A.length - 1;
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