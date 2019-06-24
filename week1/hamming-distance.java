class Solution {
    public int hammingDistance(int x, int y) {
        int differences = x ^ y; 
        int ones = 0; 
        while (differences > 0) { 
            ones += differences & 1; 
            differences >>= 1; 
        } 
        return ones;
    }
}