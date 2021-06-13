class Solution:
    def reverseWords(self, s: str) -> str:
        result = ""
        words = s.split(" ")
        for i in range(0, len(words)):
            result += self.reverseWord(words[i]) + " "
        return result[:-1]
    
    def reverseWord(self, s: str) -> str:
        return s[::-1]