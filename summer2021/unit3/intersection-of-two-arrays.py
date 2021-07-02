class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        smallerSet = set(nums1 if len(nums1) < len(nums2) else nums2)
        largerList = (nums1 if len(nums1) > len(nums2) else nums2)
        
        res = set()
        for i in largerList:
            if i in smallerSet:
                res.add(i)
        return list(res)