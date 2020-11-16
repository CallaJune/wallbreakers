class Solution:
    def multiply(self, A: List[List[int]], B: List[List[int]]) -> List[List[int]]:
        R = [[0 for j in range(len(B[0]))] for i in range(len(A))]
        # Iterate over rows in A
        for row_a in range(len(A)):
            # Iterate over columns in B
            for col in range(len(B[0])):
                # Iterate over rows in B
                for row_b in range(len(B)):
                    R[row_a][col] += A[row_a][row_b] * B[row_b][col]
        return R