class Solution:
    def calPoints(self, ops: List[str]) -> int:
        scores = []
        for o in ops:
            if o == "C":
                scores.pop()
            elif o == "D":
                d = scores[-1]
                scores.append(d * 2)
            elif o == "+":
                f = scores[-1]
                s = scores[-2]
                scores.append(f + s)
            else:
                scores.append(int(o))
        res = 0
        while len(scores) > 0:
            res += scores.pop()
        return res
                