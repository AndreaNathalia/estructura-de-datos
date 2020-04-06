import heapq
from typing import Tuple

class MinHeap:
    def __init__(self):
        self.heap = []
    
    ############################

    def heapify(self):
        heapq.heapify(self.heap)
    
    def insert(self, n):
        heapq.heappush(self.heap, n)

    def delete(self):
        heapq.heappop(self.heap)


    def printHeap(self):
        print(self.heap) 


# Main
def main():
    heap = MinHeap()
    print("\n\nFirst heap: ")
    initial_values = [1, 3, 5, 7, 9, 4, 6, 8, 0]
    for i in initial_values:
        heap.insert(i)

    heap.heapify()
    heap.printHeap()

    print("\nSecond heap (with 1 element deleted): ")
    heap.delete()
    heap.heapify()
    heap.printHeap()

    print("\nThird heap (adding 1 element): ")
    heap.insert(2)
    heap.heapify()
    heap.printHeap()



if __name__ == "__main__":
    main()