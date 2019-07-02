class Multiset<T> {
	HashMap<T, Integer> map;

	public Multiset() {
		map = new HashMap<T, Integer>();
	}

	public void add(T element) {
		if (map.containsKey(element)) {
			map.put(element, map.get(element) + 1);
		} else {
			map.put(element, 1);
		}
	}

	public boolean contains(T element) {
		return map.containsKey(element);
	}

	public boolean containsAll(Collection<T> collection) {
		for (T item : collection) {
			if (!map.containsKey(item)) {
				return false;
			}
		}
		return true;
	}

	public count(T element) {
		return map.get(element);
	}

	public Set<T> elementSet() {
		map.keySet();
	}

	public Set<Map.Entry<T, Integer>> entrySet() {
		return map.entrySet();
	}

	public void remove(T element) {
		map.put(element, map.get(element) - 1);
		if (map.get(element) <= 0) {
			map.remove(element);
		}
	}

	public int size() {
		int size = 0;
		for (T element : map.keySet()) {
			size += map.get(element);
		}
		return size;
	}

	public boolean setCount(T element, int oldCount, int newCount) {
		if (map.get(element) >= oldCount) {
			map.put(element, newCount);
			return true;
		} else {
			return false;
		}
	}
}