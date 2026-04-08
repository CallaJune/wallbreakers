class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for row in image:
            self.reverseAndInvertRow(row)
        return image
    
    def reverseAndInvertRow(self, row: List[int]):
        lo = 0
        hi = len(row) - 1
        while lo < hi:
            if row[lo] == row[hi]:
                row[lo] = int(not row[lo])
                row[hi] = int(not row[hi])
            lo += 1
            hi -= 1
        if len(row) % 2 == 1:
            row[lo] = int(not row[lo])

