class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        sMap = self.count(s)
        tMap = self.count(t)
        
        for k in tMap:
            if k not in sMap or sMap[k] != tMap[k]:
                return k
    
    def count(self, s: str) -> dict:
        result = {}
        for i in s:
            if i in result:
                result[i] += 1
            else:
                result[i] = 1
        return result