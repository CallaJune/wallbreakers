class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        if not self.validateRowsCols(board, 0, 9, 0, 9):
            return False
        
        if (not self.validateBlock(board, 0, 3, 0, 3) or not self.validateBlock(board, 0, 3, 3, 6) or not self.validateBlock(board, 0, 3, 6, 9)):
            return False
        
        if (not self.validateBlock(board, 3, 6, 0, 3) or not self.validateBlock(board, 3, 6, 3, 6) or not self.validateBlock(board, 3, 6, 6, 9)):
            return False
        
        if (not self.validateBlock(board, 6, 9, 0, 3) or not self.validateBlock(board, 6, 9, 3, 6) or not self.validateBlock(board, 6, 9, 6, 9)):
            return False
    
        return True
    
    def validateBlock(self, board: List[List[str]], loR: int, hiR: int, loC: int, hiC: int) -> bool:
        numSet = set()
        for row in range(loR, hiR):
            for col in range(loC, hiC):
                i = board[row][col]
                if i.isdigit():
                    iNum = int(i)
                    if iNum > 9 or iNum < 1 or iNum in numSet:
                        return False
                    else:
                        numSet.add(iNum)
                else:
                    if i != ".":
                        return False
        return True
    
    def validateRowsCols(self, board: List[List[str]], loR: int, hiR: int, loC: int, hiC: int) -> bool:
        for row in range(loR, hiR):
            if not self.validateList(board[row][loR:hiR]):
                return False
            
            colList = []
            for col in range(loC, hiC):
                colList.append(board[col][row])
            if not self.validateList(colList):
                return False
            
        return True
                
    def validateList(self, nums: List[str]) -> bool:
        numSet = set()
        for i in nums:
            if i.isdigit():
                iNum = int(i)
                if iNum > 9 or iNum < 1 or iNum in numSet:
                    return False
                else:
                    numSet.add(iNum)
            else: 
                if i != ".":
                    return False
        return True
                