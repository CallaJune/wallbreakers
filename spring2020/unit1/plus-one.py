class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        result = []
        carry = True
        for i in digits[::-1]:
            add_one = i + (1 if carry else 0)
            if add_one < 10:
                carry = False
            else:
                add_one = 0
                carry = True
            result.insert(0, add_one)
        if carry:
            result.insert(0, 1)
        return result