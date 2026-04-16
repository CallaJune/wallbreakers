class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        num_types = len(set(candyType))
        max_candies = len(candyType) // 2
        return min(num_types, max_candies)
