class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = []
        sort = sorted(strs)
        i = 0
        j = 0
        first = sort[0]
        last = sort[-1]
        while i < len(first) and j < len(last):
            if first[i] == last[j]:
                result.append(first[i])
            else:
                break
            i += 1
            j += 1
        return "".join(result)
