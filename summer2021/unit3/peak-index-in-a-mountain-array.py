class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        return self.findPeak(0, len(arr) - 1, arr)
    
    def findPeak(self, lo, hi, arr):
        if lo > hi:
            return -1
        
        mid = int((lo + hi) / 2)
        
        if arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1]:
            return mid
        elif arr[mid] < arr[mid - 1]:
            return self.findPeak(lo, mid - 1, arr)
        else:
            return self.findPeak(mid + 1, hi, arr)