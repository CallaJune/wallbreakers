class Solution:
    def isValid(self, s: str) -> bool:
        pairs = {
            ")": "(",
            "}": "{",
            "]": "["
        }
        openings = set(["(", "{", "["])
        stack = []
        for i in s:
            if i in openings:
                stack.append(i)
            elif i in pairs:
                if len(stack) == 0 or not pairs[i] == stack.pop():
                    return False
        return len(stack) == 0