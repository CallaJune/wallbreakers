class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = n;
        while (sum != 1) {
            set.add(sum);
            sum = sumOfSquares(sum);
            if (set.contains(sum))
                return false;
        }
        return true;
    }
    
    public int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int)(n % 10) * (int)(n % 10);
            n /= 10;
        }
        return sum;
    }
}