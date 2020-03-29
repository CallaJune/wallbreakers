import collections


class Solution:
    def uncommonFromSentences(self, A: str, B: str) -> List[str]:
        all_words = []
        for i in A.split():
            all_words.append(i)
        for i in B.split():
            all_words.append(i)

        counter = collections.Counter(all_words)

        uncommon_words = []
        for i in counter:
            if counter[i] == 1:
                uncommon_words.append(i)
        return uncommon_words
