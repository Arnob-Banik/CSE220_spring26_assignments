package Intro_Lab_Tasks;

public class ArrayQueue {

    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;   
    public ArrayQueue(int arrayLen) {
        this.queue = new Object[arrayLen];
        this.size = arrayLen;
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }

    public void enqueue(Object element) {
        if (count == size) {
            System.out.println("queue overflow");
            return;
        }

        queue[rear] = element;
        rear = (rear + 1) % size;
        count++;
    }

    public Object dequeue() {
        if (count == 0) {
            System.out.println("queue underflow");
            return null;
        }

        Object temp = queue[front];
        front = (front + 1) % size;
        count--;
        return temp;
    }

    public Object peek() {
        if (count == 0) {
            System.out.println("queue is empty");
            return null;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    
}