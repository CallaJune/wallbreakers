class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}
        for word in strs:
            key = tuple(sorted(word))
            if key in groups:
                groups[key].append(word)
            else:
                groups[key] = [word]
        return groups.values()
