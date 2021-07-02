from collections import Counter

class Solution:
    def frequencySort(self, s: str) -> str:
        counts = Counter(s)
        
        result = []
        for c in counts.most_common():
            freq = c[1]
            result.append(c[0] * freq)
        return "".join(result)