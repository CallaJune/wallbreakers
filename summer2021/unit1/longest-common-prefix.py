class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = ""
        for i in range(len(strs[0])):
            current_value = strs[0][i]
            add_to_result = True
            for s in strs:
                if len(s) > i and s[i] == current_value:
                    continue
                else:
                    add_to_result = False
                    return result
            if add_to_result:
                result += current_value
        return result
            