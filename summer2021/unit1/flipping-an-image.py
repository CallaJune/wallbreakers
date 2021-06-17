class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for i in range(len(image)):
            image[i] = self.reverse(image[i])
            for j in range(len(image[0])):
                image[i][j] = 1 - image[i][j]
        return image
    
    def reverse(self, row: List[int]) -> List[int]:
        lo = 0
        hi = len(row) - 1
        while lo < hi:
            temp = row[lo]
            row[lo] = row[hi]
            row[hi] = temp
            lo += 1
            hi -= 1
        return row