class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        a1 = word.upper()
        a2 = word.lower()
        a3 = word[0].upper() + word[1:].lower()
        return word == a1 or word == a2 or word == a3
