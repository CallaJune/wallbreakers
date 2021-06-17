class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        result = 0
        for i in range(len(s)):
            j = i
            found_chars = set()
            while j <= len(s):
                if j == len(s) or s[j] in found_chars:
                    result = max(result, j - i)
                    break
                else:
                    found_chars.add(s[j])
                    j += 1
            if j == len(s) - 1:
                return result
        return result
            