import java.util.Queue;

class Implement {
    int front, rear, size;
    int capacity;
    int arr[];

    Implement(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    boolean isFull(Implement queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Implement queue) {
        return (queue.size == 0);
    }

    void enqueue(int item) {
        if (isFull(this)) {
            return;
        }
        this.rear = (this.rear + 1) % capacity;
        arr[this.rear] = item;
        this.size += 1;
    }

    int dequeue() {
        if (isEmpty(this)) {
            return 0;
        }
        int item = this.arr[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size -= 1;
        return item;

    }

}

public class queue {
    public static void main(String[] args) {
        Implement queue = new Implement(1000);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue() + " dequeued from queue\n");

        System.out.println(queue.dequeue() + " dequeued from queue\n");
    }
}