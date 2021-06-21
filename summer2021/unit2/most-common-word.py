class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        bannedSet = set(banned)
        
        paragraphCleaned = ""
        for c in paragraph:
            if c.isalnum():
                paragraphCleaned += c.lower()
            else:
                paragraphCleaned += " "
        paragraphWords = paragraphCleaned.split()
        
        countedWords = {}
        for word in paragraphWords:
            if word not in bannedSet:
                if word in countedWords:
                    countedWords[word] += 1
                else:
                    countedWords[word] = 1
        maxWord = ""
        maxCount = 0
        for k in countedWords:
            if countedWords[k] > maxCount:
                maxWord = k
                maxCount = countedWords[k]
        return maxWord
        
        