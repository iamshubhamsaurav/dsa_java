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
}
