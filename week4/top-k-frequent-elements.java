class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue<Integer> q = new PriorityQueue<Integer>((i, j) -> map.get(i) - map.get(j));

        for (int num: map.keySet()) {
            q.add(num);
            if (q.size() > k) {
                q.poll();
            }
        }

        List<Integer> result = new LinkedList<>();
        
        while (!q.isEmpty()) {
            result.add(q.poll());
        }
        
        Collections.reverse(result);
        return result;
    }
}