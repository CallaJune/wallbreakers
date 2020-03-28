class Solution:
    def isHappy(self, n: int) -> bool:
        sums = set()
        res = n
        while res != 1:
            sums.add(res)
            res = self.sumSquares(res)
            if res in sums:
                return False
        return True

    def sumSquares(self, n: int) -> int:
        res = 0
        while n > 0:
            res += int(n % 10) * int(n % 10)
            n /= 10
        return res
