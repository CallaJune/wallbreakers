class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sd = self.makeDict(s)
        td = self.makeDict(t)
        return sd == td
    
    def makeDict(self, w: str) -> dict:
        result = {}
        for i in w:
            if i in result:
                result[i] += 1
            else:
                result[i] = 1
        return result