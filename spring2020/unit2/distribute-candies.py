class Solution:
    def distributeCandies(self, candies: List[int]) -> int:
        return min(len(set(candies)), int(len(candies) / 2))
