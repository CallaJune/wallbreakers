class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        result = 0
        for i in t:
            result += ord(i)
        for i in s:
            result -= ord(i)
        return chr(result)
