class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        lo = 0
        hi = len(s) - 1
        while lo < hi:
            temp = s[lo]
            s[lo] = s[hi]
            s[hi] = temp
            lo += 1
            hi -= 1