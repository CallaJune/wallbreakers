class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            return False
        elif len(s) == 0:
            return True
        si = 0
        ti = 0
        while si < len(s) and ti < len(t):
            if t[ti] != s[si]:
                ti += 1
            else:
                ti += 1
                si += 1
                if si == len(s):
                    return True
        return False