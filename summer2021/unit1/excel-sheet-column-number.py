class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        total = 0
        n = 0
        for c in columnTitle:
            total = (total * 26) + (ord(c) - 65) + 1
            n += 1
        return total