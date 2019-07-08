class Solution {
    public int maxProfit(int[] prices) {
        //return dynamicProgramming(prices);
        return recursion(prices);
    }
    
    public int recursion(int[] prices) {
        
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