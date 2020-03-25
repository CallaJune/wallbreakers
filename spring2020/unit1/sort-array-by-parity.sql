class Solution:
    def sortArrayByParity(self, A: List[int]) -> List[int]:
        lo = 0
        hi = len(A) - 1
        result = []
        for i in A:
            result.append(None)
        for i in A:
            if i % 2 == 0:
                result[lo] = i
                lo += 1
            else:
                result[hi] = i
                hi -= 1
        return result