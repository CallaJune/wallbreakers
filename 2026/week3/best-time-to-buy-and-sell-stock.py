class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        local_min = float('inf')
        for current in prices:
            if current < local_min:
                local_min = current
            selling_price = current - local_min
            if max_profit < selling_price:
                max_profit = selling_price
        return max_profit
