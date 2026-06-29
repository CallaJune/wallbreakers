class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        lo = 0
        hi = len(arr) - 1
        while lo < hi:
            mid = lo + (hi - lo) // 2
            if arr[mid] < arr[mid + 1]:
                lo = mid + 1
            else:
                hi = mid
        return lo
