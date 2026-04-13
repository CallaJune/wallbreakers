class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        s1_words = Counter(s1.split(" "))
        s2_words = Counter(s2.split(" "))
        result = []
        for word in s1_words:
            if s1_words[word] == 1 and word not in s2_words:
                result.append(word)
        for word in s2_words:
            if s2_words[word] == 1 and word not in s1_words:
                result.append(word)
        return result
