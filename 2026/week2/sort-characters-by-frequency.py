class Solution:
    def frequencySort(self, s: str) -> str:
        counter = Counter(s)
        result = []
        while len(counter) > 0:
            max_char = ''
            max_val = 0
            for key in counter:
                if counter[key] > max_val:
                    max_val = counter[key]
                    max_char = key
            result.append(max_char * max_val)
            del counter[max_char]
        return "".join(result)

class Solution:
    def frequencySort(self, s: str) -> str:
        counter = Counter(s)
        result = []
        for i, j in counter.most_common():
            result.append(i * j)
        return "".join(result)