class Solution:
    def countSubstrings(self, s: str) -> int:
        mem = {}
        result = 0
        for i in range(len(s)):
            for j in range(i, len(s) + 1):
                current = s[i:j]
                if current == '':
                    continue
                if current not in mem:
                    mem[current] = self.isPalindrome(current)
                if mem[current]:
                    result += 1
        return result
                
    
    def isPalindrome(self, s):
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