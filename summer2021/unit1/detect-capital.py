class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        word1 = word.upper()
        word2 = word.lower()
        word3 = word[0].upper() + word[1:].lower()
        return word == word1 or word == word2 or word == word3
        