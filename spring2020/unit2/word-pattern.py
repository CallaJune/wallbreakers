class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        pat_map = {}
        str_split = str.split()
        pattern_len = len(pattern)
        if len(str_split) != pattern_len:
            return False
        for i in range(pattern_len):
            if pattern[i] in pat_map:
                if pat_map[pattern[i]] != str_split[i]:
                    return False
            else:
                if str_split[i] in set(pat_map.values()):
                    return False
                pat_map[pattern[i]] = str_split[i]
        return True
