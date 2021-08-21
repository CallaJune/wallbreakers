class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        if not points:
            return 0
        points.sort(key = lambda x : x[1])
        arrows = 1
        first = points[0][1]
        for start, end in points:
            if first < start:
                arrows += 1
                first = end
        return arrows
                