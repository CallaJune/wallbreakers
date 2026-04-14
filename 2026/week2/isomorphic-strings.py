class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mappings = {}
        seen = set()
        for i in range(len(s)):
            if s[i] not in mappings:
                if t[i] in seen:
                    return False
                mappings[s[i]] = t[i]
                seen.add(t[i])
            else:
                if mappings[s[i]] != t[i]:
                    return False
        return True
        