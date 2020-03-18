class Solution {
    boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2)
            return true;
        if (n <= 0 || n % 2 == 1)
            return false;
        return isPowerOfTwo(n / 2);
    }
}