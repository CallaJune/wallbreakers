from collections import Counter

class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        all_words = []
        for i in s1.split():
            all_words.append(i)
        for i in s2.split():
            all_words.append(i)
        
        counter = Counter(all_words)
        uncommon_words = []
        for i in counter:
            if counter[i] == 1:
                uncommon_words.append(i)
        return uncommon_words