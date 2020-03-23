class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return self.charCounts(s) == self.charCounts(t)

    def charCounts(self, s: str) -> dict:
        d = {}
        for c in s:
            if c in d:
                d[c] = d[c] + 1
            else:
                d[c] = 1
        return d
