class Solution {
    public int maxProfit(int[] prices) {
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