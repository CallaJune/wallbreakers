class Solution {
    /* Take an element in the first array and then 
     * find the same element in the second array 
     * and then look to the right in the second array 
     * to find a greater one.
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        
        // Populate hashmap with items in map and their indices
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        
        // Iterate through nums2
        for (int i = 0; i < nums2.length; i++) {
            // If the most recent item added to the stack is less than the current item
            // check whether nums1 maps to the previous item because the current item
            // is its next greater element
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                Integer num = map.get(stack.pop());
                if(num != null){
                    result[num] = nums2[i];
                }
            }
            // Add each item in nums2 to stack, in order
            stack.push(nums2[i]);
        }
        return result;
    }
}