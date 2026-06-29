class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        amounts = [20, 10, 5]
        change = {
            20: 0,
            10: 0,
            5: 0
        }
        for bill in bills:
            change[bill] += 1
            change_needed = bill - 5
            i = 0
            while change_needed > 0:
                if i >= len(amounts):
                    return False
                elif amounts[i] <= change_needed and change[amounts[i]] > 0:
                    change[amounts[i]] -= 1
                    change_needed -= amounts[i]
                else: 
                    i += 1
        return True
