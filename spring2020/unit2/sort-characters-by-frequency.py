import collections


class Solution:
    def frequencySort(self, s: str) -> str:
        counter = collections.Counter(s)
        res = ""
        for c in counter.most_common(len(set(s))):
            for i in range(c[1]):
                res += c[0]
        return res
