package queues;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueueTest queue = new PriorityQueueTest(3);
        queue.enque(5);
        System.out.println(queue.size);
        for (int i = 0; i < queue.arr.length; i++) {
            System.out.println(queue.arr[i]);
        }

        queue.enque(14);
        for (int i = 0; i < queue.arr.length; i++) {
            System.out.println(queue.arr[i]);
        }

        queue.enque(10);
        for (int i = 0; i < queue.arr.length; i++) {
            System.out.println(queue.arr[i]);
        }
    }

        int arr[];
        int capacity;
        int size;
    
        PriorityQueueTest(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            this.size = 0;
        }

        private void enque(int x) {
            if(isFull()) return;


            if(size == 0) {
                arr[0] = x;
                size++;
                return;
            }


            int i = size - 1;


            while(i >= 0 && arr[i] < x) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i + 1] = x;
            size++;
        }

        private void deque() {
            if (isEmpty()) return;
            for (int i = 0; i < size; i++) {
                arr[i] = arr[i + i];
            }
            size--;
        }

        private int getFront() {
            if(size == 0) return -1;
            return arr[0];
        }

        private int getRear() {
            if(size == 0) return -1;
            return arr[size - 1];
        }

        private boolean isFull() {
            if(size == capacity) return true;
            return false;
        }

        private boolean isEmpty() {
            if(size == 0) return true;
            return false;
        }

        private int size() {
            return size;
        }



}


