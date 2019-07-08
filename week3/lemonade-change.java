// Uses the multiset class in Multiset.java
class Solution {
    public boolean lemonadeChange(int[] bills) {
        Multiset<Integer> change = new Multiset<>();
        for (int bill : bills) {
            if (!executeTransaction(change, bill)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean executeTransaction(Multiset<Integer> changeOnHand, int bill) {
        // Take customer's bill and add it to change on hand
        changeOnHand.add(bill);
        
        // Check if customer paid exact change
        int changeNeeded = bill - 5;
        if (changeNeeded == 0) {
            return true;
        }
        
        int[] options = {20, 10, 5};
        int p = 0;
        while (changeNeeded != 0) {
            // Return false if no options available
            if (p >= options.length) {
                return false;
            }
            
            // Set p to the highest possible bill
            if (options[p] > changeNeeded || !changeOnHand.contains(options[p])) {
                p++;
                continue;
            }
            
            changeNeeded -= options[p];
            changeOnHand.remove(options[p]);
        }
        return true;
    }
}