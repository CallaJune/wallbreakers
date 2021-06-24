class Solution:
    def firstUniqChar(self, s: str) -> int:
        counts = {}
        for c in s:
            if c in counts:
                counts[c] += 1
            else:
                counts[c] = 1
        countsList = []
        for c in s:
            countsList.append(counts[c])
        for i in range(len(countsList)):
            if countsList[i] == 1:
                return i
        return -1