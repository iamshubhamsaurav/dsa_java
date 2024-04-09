package queues;

public class SimpleQueueTest {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(3);
        queue.enque(1);
        // System.out.println(queue.deque());
        queue.enque(2);
        // System.out.println(queue.deque());
        queue.enque(3);
        // System.out.println(queue.deque());
        queue.enque(4);

        System.out.println("Is Queue Full: " + queue.isFull());
        System.out.println("Is Queue Empty: " + queue.isEmpty());

        int val = queue.deque();
        System.out.println("Deque: " + val);

        val = queue.deque();
        System.out.println("Deque: " + val);

        val = queue.deque();
        System.out.println("Deque: " + val);

        queue.deque();

        System.out.println("Is Queue Full: " + queue.isFull());
        System.out.println("Is Queue Empty: " + queue.isEmpty());
    }
}

class SimpleQueue {
    private int arr[];
    private int capacity;
    private int size;

    SimpleQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        this.size = 0;
    }

    void enque(int x) {
        if(isFull()) return;
        arr[size] = x;
        System.err.println("Enqued: " + arr[size]);
        size++;
    }

    int deque() {
        if (isEmpty()) return -1;

        int value = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return value;
    }

    int getFront() {
        if(size == 0) return -1;
        return arr[0];
    }

    int getRear() {
        if(size == 0) return -1;
        return arr[size - 1];
    }

    boolean isFull() {
        if(size == capacity) return true;
        return false;
    }

    boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }

    private int size() {
        return size;
    }
}


