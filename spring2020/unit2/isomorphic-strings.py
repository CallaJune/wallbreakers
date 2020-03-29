class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        letters = {}
        for i in range(len(s)):
            if s[i] in letters:
                if letters[s[i]] != t[i]:
                    return False
            else:
                if t[i] in set(letters.values()):
                    return False
                letters[s[i]] = t[i]
        return True
