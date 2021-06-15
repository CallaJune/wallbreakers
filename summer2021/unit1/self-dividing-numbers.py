class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        result = []
        for i in range(left, right + 1):
            if self.isSelfDividingNumber(i):
                result.append(i)
        return result
    
    def isSelfDividingNumber(self, n: int) -> bool:
        i = n
        while i > 0:
            d = (int)(i % 10)
            if d == 0 or (n % d) != 0:
                return False
            i //= 10
        return True
            