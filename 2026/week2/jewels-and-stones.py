class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        char_dict = Counter(jewels)
        result = 0
        for stone in stones:
            if stone in char_dict:
                result += 1
        return result
        