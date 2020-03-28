import collections


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        banned_set = set(banned)

        paragraph_parsed = ""
        for i in paragraph:
            if i.isalnum():
                paragraph_parsed += i.lower()
            else:
                paragraph_parsed += " "

        element_list = []
        for i in paragraph_parsed.split():
            if i not in banned_set:
                element_list.append(i)

        counter = collections.Counter(element_list)

        return counter.most_common(1)[0][0]
