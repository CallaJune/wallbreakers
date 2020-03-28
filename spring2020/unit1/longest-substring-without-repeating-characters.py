class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        answer = 0
        i = 0
        j = 0
        n = len(s)
        window = set()
        while i < n and j < n:
            if s[j] not in window:
                window.add(s[j])
                j += 1
                answer = max(answer, j - i)
            else:
                window.remove(s[i])
                i += 1
        return answer