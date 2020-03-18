class Solution {
     public static List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(0);
		grayCode(result, n, 0, 1 << n);
		return result;
	}
    
	public static void grayCode(List<Integer> result, int n, int current, int size) {
		if(result.size() == size) {
            return;
        }
		for (int i = 0; i < n; i++) {
			int mask = 1 << i;
			int p = (current ^ mask);
			if(!result.contains(p)) {
				result.add(p);
				grayCode(result, n, p, size);
				if(result.size() == size) {
                    return;
                }
				result.remove(new Integer(p));
			}
		}
	}
}