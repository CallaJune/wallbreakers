class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        quadrants = [set() for i in range(9)]
        rows = [set() for i in range(9)]
        cols = [set() for i in range(9)]

        for i, row in enumerate(board):
            for j, current in enumerate(row):
                if current == ".":
                    continue
                if not self.addOrInvalidate(rows[i], current):
                    return False
                if not self.addOrInvalidate(cols[j], current):
                    return False
                if not self.addOrInvalidate(quadrants[(i // 3) * 3 + (j // 3)], current):
                    return False
        return True
    
    def addOrInvalidate(self, s: set, v: int) -> bool:
        if v in s:
            return False
        s.add(v)
        return True
