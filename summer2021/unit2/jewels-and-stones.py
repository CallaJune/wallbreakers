class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewelsSet = set()
        for j in jewels:
            jewelsSet.add(j)
        result = 0
        for s in stones:
            if s in jewelsSet:
                result += 1
        return result