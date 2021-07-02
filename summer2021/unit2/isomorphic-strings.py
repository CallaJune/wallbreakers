class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        return self.createPattern(s) == self.createPattern(t)
    
    def createPattern(self, s: str) -> str:
        d = {}
        i = 0
        for c in s:
            if c not in d:
                d[c] = i
                i += 1
        res = []
        for c in s:
            res.append(str(d[c]))
        return "".join(res)
            