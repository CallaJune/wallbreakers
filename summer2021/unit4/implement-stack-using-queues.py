from collections import deque

class MyStack:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.queue = deque()
        

    def push(self, x: int) -> None:
        """
        Push element x onto stack.
        """
        self.queue.append(x)
        

    def pop(self) -> int:
        """
        Removes the element on top of the stack and returns that element.
        """
        queue2 = deque()
        while (len(self.queue) > 1):
            queue2.append(self.queue.popleft())
        poppedItem = self.queue.popleft()
        while (len(queue2) > 0):
            self.queue.append(queue2.popleft())
        return poppedItem
        

    def top(self) -> int:
        """
        Get the top element.
        """
        print(self.queue)
        queue2 = deque()
        while (len(self.queue) > 1):
            queue2.append(self.queue.popleft())
        poppedItem = self.queue.pop()
        queue2.append(poppedItem)
        while (len(queue2) > 0):
            self.queue.append(queue2.popleft())
        print(self.queue)
        return poppedItem
        

    def empty(self) -> bool:
        """
        Returns whether the stack is empty.
        """
        return len(self.queue) == 0
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()