import collections


class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        counter = collections.Counter()
        for c in s:
            counter.update(c)
        for c in t:
            counter.subtract(c)
        for item in counter:
            if counter[item] != 0:
                return item
        return ""
