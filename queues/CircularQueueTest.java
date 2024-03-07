package queues;

public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(3);
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.print();
        
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

        queue.enque(4);
        queue.print();
    }
}

class CircularQueue {
    int capacity;
    int size;
    int front;
    int arr[];

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        arr = new int[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getFront() {
        if(isEmpty()) return -1;
        return front;
    }

    int getRear() {
        if(isEmpty()) return -1;
        return (front + size - 1) % capacity;
    }

    void enque(int x) {
        if(isFull()) {
            System.err.println("Queue is already full.");
            return;
        }

        int rear = getRear();
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    int deque() {
        if(isEmpty()) {
            System.out.println("Queue is already empty.");
            return -1;
        }
        int temp = arr[front];
        arr[front] = 0;
        front = (front + 1) % capacity;
        size--;

        return temp;
    }


    // For Testing Only 
    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
