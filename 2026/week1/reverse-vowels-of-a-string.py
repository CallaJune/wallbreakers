class Solution:
    def reverseVowels(self, s: str) -> str:
        charList = list(s)
        lo = 0
        hi = len(s) - 1
        while lo < hi:
            loIsVowel = self.isVowel(charList[lo])
            hiIsVowel = self.isVowel(charList[hi])
            if loIsVowel and hiIsVowel:
                temp = charList[lo]
                charList[lo] = charList[hi]
                charList[hi] = temp
                lo += 1
                hi -= 1
            elif not loIsVowel:
                lo += 1
            elif not hiIsVowel:
                hi -= 1
        return "".join(charList)
    
    def isVowel(self, c) -> bool:
        return c.lower() in ['a', 'e', 'i', 'o', 'u']
