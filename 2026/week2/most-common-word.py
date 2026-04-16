class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        paragraph = re.sub(r'[^\w\s]', ' ', paragraph.lower())
        words = Counter(paragraph.split())
        banned_set = set(banned)
        res = ''
        current_max = 0
        for key in words:
            if key not in banned_set and words[key] > current_max:
                current_max = words[key]
                res = key
        return res
