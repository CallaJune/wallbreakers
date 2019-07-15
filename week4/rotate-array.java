class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = nums.length - k; i < nums.length; i++) {
            q.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k; i++) {
            q.add(nums[i]);
        }
        int i = 0;
        while (i < nums.length) {
            nums[i] = q.remove();
            i++;
        }
    }
}