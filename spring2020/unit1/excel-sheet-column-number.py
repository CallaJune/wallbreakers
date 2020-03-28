class Solution:
    def titleToNumber(self, s: str) -> int:
        n = 0
        for c in s:
            n = n * 26 + ord(c) - ord("A") + 1
        return n
