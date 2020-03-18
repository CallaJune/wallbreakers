class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }
    
    public boolean isSelfDividing(int n) {
        int d = n;
        while (d > 0) {
            // Truncate next digit from n
            int c = d % 10;
            // Check whether n is evenly divisible by c
            if (c == 0 || n % c != 0) {
                return false;
            }
            d /= 10;
        }
        return true;
    }
}