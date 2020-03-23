class Solution:
    def reverseVowels(self, s: str) -> str:
        sarr = list(s)
        vowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]

        lo = 0
        hi = len(sarr) - 1
        while lo < hi:
            if sarr[lo] not in vowels:
                lo += 1
                continue

            if sarr[hi] not in vowels:
                hi -= 1
                continue

            temp = sarr[lo]
            sarr[lo] = sarr[hi]
            sarr[hi] = temp
            lo += 1
            hi -= 1

        return "".join(sarr)
