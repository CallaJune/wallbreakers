class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramGroups = {}
        for s in strs:
            sLetters = tuple(sorted(s))
            if sLetters in anagramGroups:
                anagramGroups[sLetters].append(s)
            else:
                anagramGroups[sLetters] = [s]
        result = []
        for k in anagramGroups:
            result.append(anagramGroups[k])
        return result