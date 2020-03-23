class Solution:
    def reverseWords(self, s: str) -> str:
        pieces = s.split(" ")
        result = ""
        for i in range(len(pieces)):
            result += pieces[i][::-1]
            if i < len(pieces) - 1:
                result += " "
        return result
