class Solution:
    def flipAndInvertImage(self, A: List[List[int]]) -> List[List[int]]:
        B = []
        for row in A:
            B.append(row[::-1])

        for i in range(len(B)):
            for j in range(len(B[0])):
                temp = B[i][j]
                B[i][j] = 1 - B[i][j]
        return B
