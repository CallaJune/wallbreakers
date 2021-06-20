class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lettersMap = {}
        mappedWords = set()
        words = s.split()
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            currentWord = words[i]
            currentLetter = pattern[i]
            if currentLetter not in lettersMap:
                if currentWord in mappedWords:
                    return False
                lettersMap[currentLetter] = currentWord
                mappedWords.add(currentWord)
            else:
                if lettersMap[currentLetter] != currentWord:
                    return False
        return True