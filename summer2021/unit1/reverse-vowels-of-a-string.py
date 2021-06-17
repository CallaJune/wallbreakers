class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
        sList = list(s)
        lo = 0
        hi = len(sList) - 1
        while lo < hi:
            if sList[lo] not in vowels:
                lo += 1
                continue
            if sList[hi] not in vowels:
                hi -= 1
                continue
            temp = sList[lo]
            sList[lo] = sList[hi]
            sList[hi] = temp
            lo += 1
            hi -= 1
        return ''.join(sList)
        