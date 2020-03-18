// Uses the multiset class in Multiset.java
class Solution {
    public int[] findErrorNums(int[] nums) {
        Multiset<Integer> ms = new Multiset<>();
        for (int num : nums) {
            ms.add(num);
        }
        int[] result = new int[2];
        for (int i = 1; i <= nums.length; i++) {
            if (!ms.contains(i)) {
                result[1] = i;
            } else if (ms.count(i) == 2) {
                result[0] = i;
            }
        }
        return result;
    }
}