class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int> result(nums.size(), 0);
        int p1 = 0;
        int p2 = nums.size() - 1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] % 2 == 0) {
                result[p1] = nums[i];
                p1++;
            } else {
                result[p2] = nums[i];
                p2--;
            }
        }
        return result;
    }
};
