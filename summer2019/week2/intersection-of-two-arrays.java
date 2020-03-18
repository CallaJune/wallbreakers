class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n) && !resultSet.contains(n)) {
                resultSet.add(n);
            }
        }
        int[] result = new int[resultSet.size()];
        int p = 0;
        for (int n : resultSet) {
            result[p++] = n;
        }
        return result;
    }
}