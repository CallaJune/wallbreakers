class Solution {
    public double myPow(double x, int n) {
        return myPow(x, n, 1);
    }
    
    public double myPow(double x, int n, double a) {
        if (n == 0) {
            return a;
        } else if (n > 0) {
            return myPow(x, n - 1, a * x);
        } else {
            return myPow(x, n + 1, a / x);
        }
    }
}