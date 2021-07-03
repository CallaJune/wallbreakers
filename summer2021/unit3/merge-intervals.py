class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        merged = []
        for i in range(len(intervals)):
            if len(merged) == 0 or merged[-1][1] < intervals[i][0]:
                merged.append(intervals[i])
            else:
                merged[-1] = [min(merged[-1][0], intervals[i][0]), max(merged[-1][1], intervals[i][1])]
        return merged