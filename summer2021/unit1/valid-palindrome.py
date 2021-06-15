class Solution:
    def isPalindrome(self, s: str) -> bool:
        lo = 0
        hi = len(s) - 1
        s = s.lower()
        while lo < hi:
            if not s[lo].isalnum():
                lo += 1
                continue
            if not s[hi].isalnum():
                hi -= 1
                continue
            if s[lo] != s[hi]:
                return False
            lo += 1
            hi -= 1
        return True