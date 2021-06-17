class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        while n > 0:
            if n == 1:
                return True
            if n != 1 and n % 2 != 0:
                return False
            n /= 2
        return False