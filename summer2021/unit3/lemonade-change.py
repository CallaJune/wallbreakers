class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        amounts = [20, 10, 5]
        changeBank = {
            5: 0,
            10: 0,
            20: 0
        }
        for amountPaid in bills:
            changeBank[amountPaid] += 1
            changeNeeded = amountPaid - 5
            # Make change
            amountIndex = 0
            while changeNeeded > 0:
                if amountIndex >= len(amounts):
                    return False
                elif amounts[amountIndex] <= changeNeeded and changeBank[amounts[amountIndex]] > 0:
                    changeNeeded -= amounts[amountIndex]
                    changeBank[amounts[amountIndex]] -= 1
                else:
                    amountIndex += 1
        return True