class MyHashSet:
    def __init__(self):
        self.hash_set = [[] for _ in range(1000)]

    def add(self, key: int) -> None:
        bucket = key % 1000
        if key not in self.hash_set[bucket]:
            self.hash_set[bucket].append(key)

    def remove(self, key: int) -> None:
        bucket = key % 1000
        if key in self.hash_set[bucket]:
            self.hash_set[bucket].remove(key)

    def contains(self, key: int) -> bool:
        bucket = key % 1000
        return key in self.hash_set[bucket]


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
