class Solution {
    public int maxProfit(int[] prices) {
        //return dynamicProgramming(prices);
        return recursion(prices);
    }
    
    public int recursion(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        return recursion(prices, prices[0], 0, 0);
    }
    
    public int recursion(int[] prices, int min, int max, int n) {
        if (n == prices.length) {
            return max;
        }
        
        if (prices[n] < min) {
            min = prices[n];
        }
        max = Math.max(max, prices[n] - min);
        return recursion(prices, min, max, n + 1);
    }
    
    public int dynamicProgramming(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i : prices) {
            if (i < min) {
                min = i;
            }
            max = Math.max(max, i - min);
        }
        return max;
    }
}