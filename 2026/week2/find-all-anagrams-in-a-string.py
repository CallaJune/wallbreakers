class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        len_p = len(p)
        len_s = len(s)
        if len_s < len_p:
            return []
        p_counter = Counter(p)
        result = []
        sliding_counter = Counter(s[:len_p])
        if sliding_counter == p_counter:
            result.append(0)
        for i in range(1, len_s - len_p + 1):
            sliding_counter[s[i - 1]] -= 1
            sliding_counter[s[i + len_p - 1]] += 1
            if sliding_counter == p_counter:
                result.append(i)
        return result
