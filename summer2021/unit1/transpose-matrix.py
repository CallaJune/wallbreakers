class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        orig_rows = len(matrix)
        orig_cols = len(matrix[0])
        result = [[None for i in range(orig_rows)] for j in range(orig_cols)]
        for i in range(orig_cols):
            for j in range(orig_rows):
                result[i][j] = matrix[j][i]
        return result