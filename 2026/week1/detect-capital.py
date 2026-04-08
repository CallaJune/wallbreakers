class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        wordLength = len(word)
        if wordLength == 1:
            return True
        i = 0
        if word[0].isupper():
            i = 1
        val = word[i].isupper()
        while i < wordLength:
            if word[i].isupper() != val:
                return False
            i += 1
        return True
