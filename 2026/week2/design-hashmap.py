class MyHashMap:

    def __init__(self):
        self.vals = [[] for _ in range(1001)]

    def put(self, key: int, value: int) -> None:
        b = key // 1000
        i = key % 1000
        if len(self.vals[b]) == 0:
            self.vals[b] = [-1 for _ in range(1000)]
        self.vals[b][i] = value

    def get(self, key: int) -> int:
        b = key // 1000
        i = key % 1000
        if len(self.vals[b]) == 0:
            return -1
        return self.vals[b][i]

    def remove(self, key: int) -> None:
        b = key // 1000
        i = key % 1000
        if len(self.vals[b]) != 0:
            self.vals[b][i] = -1

# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
