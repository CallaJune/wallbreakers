class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        l = []
        for i in range(left, right + 1):
            if self.isSelfDividing(i):
                l.append(i)
        return l

    def isSelfDividing(self, n: int):
        num = n
        while num > 0:
            rightmost = num % 10
            if rightmost == 0 or n % rightmost != 0:
                return False
            num //= 10
        return True
