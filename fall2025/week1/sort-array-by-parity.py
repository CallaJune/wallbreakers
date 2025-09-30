class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        l = [0] * len(nums)
        p1 = 0
        p2 = len(l) - 1
        for i in nums:
            if p2 < p1:
                continue
            if i % 2 == 0:
                l[p1] = i
                p1 += 1
            else:
                l[p2] = i
                p2 -= 1
        return l

        