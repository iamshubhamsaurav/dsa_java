package trees.heaps;

public class MinHeapDS {
    int[] arr;
    int size;
    int capacity;

    MinHeapDS(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        this.size = 0;
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int parent(int i) {
        return (i - 1) / 2; // floor value
    }

    void insert(int val) {
        if (this.size == this.capacity) {
            return;
        }
        size++;
        arr[size - 1] = val;

        for(int i = this.size - 1; i != 0 && arr[parent(i)] > arr[i];) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;

            // Update the i
            i = parent(i);
        }
    }

    // minHeapify assumes that only one node is out of line/sync and that node is the root node.
    // The rest are assumed to satisfy the heap rules.
    // So if root is the smallest among it's children then no need to process further
    void minHeapify(int i) {
        int leftChild = left(i);
        int rightChild = right(i);

        int smallest = i;

        if(leftChild < size && arr[leftChild] < arr[i]) {
            smallest = leftChild;
        }

        if(rightChild < size && rightChild < arr[i]) {
            smallest = rightChild;
        }

        if(smallest != i) {
            // Swap the parent Value with the smallest Value
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Call the minHeapify to check the sub-tree
            minHeapify(smallest);
        }
    } // minHeapify

    // Simply returns the min element from the array which is always the root
    // Constant time operation
    int getMin(int i) {
        if(i < size) return arr[i];
        return Integer.MAX_VALUE; // error because i is index out of bounds
    }

    int extractMin() {
        if(size == 0) return Integer.MAX_VALUE;
        if(size == 1) {
            size--;
            return arr[0];
        }
        // Swap the root with the last element
        // After swapping, cal the minHeapify to fix the heap

        // swap
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        size--;
        minHeapify(0);
        return arr[size]; // returning size because size was decremented and the min is now at size index
    }

    void decreaseKey_(int index, int value) {
        arr[index] = value;
        minHeapify(index);
    }

    void decreaseKey(int index, int value) {
        arr[index] = value;
        while (index != 0 && arr[parent(index)] > arr[index]) {
            // Swap the value of parent and the index
            int temp = arr[index];
            arr[index] = arr[parent(index)];
            arr[parent(index)] = temp;

            // Update the index to the index of parent
        }
    }


}
