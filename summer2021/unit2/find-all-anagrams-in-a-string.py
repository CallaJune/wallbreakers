from collections import Counter
class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        result = []
        
        sSize = len(s)
        pSize = len(p)
        
        if sSize < pSize:
            return result
        
        pCount = Counter(p)
        sCount = Counter()
        
        for i in range(sSize):
            sCount[s[i]] += 1
            
            if i >= pSize:
                if sCount[s[i - pSize]] == 1:
                    del sCount[s[i - pSize]]
                else:
                    sCount[s[i - pSize]] -= 1
                    
            if pCount == sCount:
                result.append(i - pSize + 1)
                
        return result