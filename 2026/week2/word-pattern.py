class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        d = {}
        e = {}
        for i in range(len(pattern)):
            if pattern[i] not in d:
                d[pattern[i]] = words[i]
            else: 
                if d[pattern[i]] != words[i]:
                    return False
            if words[i] not in e:
                e[words[i]] = pattern[i]
            else:
                if e[words[i]] != pattern[i]:
                    return False
        return True
