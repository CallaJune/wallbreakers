class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        num_types = len(set(candyType))
        num_candies = int(len(candyType) / 2)
        return min(num_types, num_candies)