class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
    
    public void combinationSum(List<List<Integer>> result, List<Integer> current, int[] nums, int target, int begin){
         
        if(target == 0){
            result.add(new ArrayList<Integer>(current));
            return;
        }
        
        for(int i = begin; i < nums.length && target >= nums[i]; i++){
            current.add(0, nums[i]);
            combinationSum(result, current, nums, target - nums[i], i);
            current.remove(0);
        }
    }
}