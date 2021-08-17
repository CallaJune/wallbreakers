class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        for num in nums1:
            found = False
            stack = nums2[::-1]
            while len(stack) >= 0:
                if len(stack) == 0:
                    result.append(-1)
                    break
                if not found:
                    if stack[-1] == num:
                        found = True
                    stack.pop()
                else:
                    if stack[-1] > num:
                        result.append(stack[-1])
                        break
                    else:
                        stack.pop()
        return result