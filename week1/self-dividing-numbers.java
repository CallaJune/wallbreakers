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
            int c = d % 10;
            if (c == 0 || n % c != 0) {
                return false;
            }
            d /= 10;
        }
        return true;
    }
}