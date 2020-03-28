class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        jewels = set()
        for j in J:
            jewels.add(j)
        num = 0
        for s in S:
            if s in jewels:
                num += 1
        return num
