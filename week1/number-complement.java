class Solution {
    public int findComplement(int num) {
        int b = 1;
        int n = num;
        while (n > 0) {
            b <<= 1;
            n /= 2;
        }
        return num ^ (b - 1);
    }
}