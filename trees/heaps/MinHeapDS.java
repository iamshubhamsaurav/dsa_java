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

}
