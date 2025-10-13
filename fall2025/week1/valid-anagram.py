class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        return self.getDictionary(s) == self.getDictionary(t)

    def getDictionary(self, word: str) -> dict:
        d = {}
        for l in word:
            if l in d:
                d[l] += 1
            else:
                d[l] = 1
        return d
