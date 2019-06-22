class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int lo = 0;
        int hi = res.length - 1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[lo] = A[i];
                lo++;
            } else {
                res[hi] = A[i];
                hi--;
            }
        }
        return res;
    }
}