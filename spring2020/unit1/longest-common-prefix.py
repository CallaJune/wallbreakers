class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        if len(strs) < 1:
            return res
        for i in range(len(strs[0])):
            next_letter = None
            for j in range(len(strs)):
                if len(strs[j]) <= i:
                    return res
                if not next_letter:
                    next_letter = strs[j][i]
                if strs[j][i] != next_letter:
                    return res
            res += next_letter
        return res
