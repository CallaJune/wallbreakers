import sys

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = sys.maxsize
        maxProfit = 0
        
        # Iterate through prices
        for i in range(len(prices)):
            # Update minPrice
            if prices[i] < minPrice:
                minPrice = prices[i]
            # Update maxProfit
            if prices[i] - minPrice > maxProfit:
                maxProfit = prices[i] - minPrice
        
        return maxProfit