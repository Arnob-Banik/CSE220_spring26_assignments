public class MinHeap {

    private Integer[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Integer[capacity+1];
        this.size = 0;
    }
    public void insert(int value) {
        if(size==capacity) {System.out.println("heap is full");
        return;
    }
        else{
            size++;
            heap[size]=value;
            heapifyUp(size);
        }


    }

    public Integer extractMin() {
        if(isEmpty()) return null;
        Integer min = heap[1];
        heap[1]= heap[size];
        heap[size]=null;
        size--;
        heapifyDown(1);
        return min;
    }

    public Integer peek() {
        if(heap[1]==null) return null;
        return heap[1];
        
    }

    // --------------------------
    // Heapify operations
    // --------------------------
    private void heapifyUp(int index) {
         while (index > 1) {
            int parent = index / 2; 
            if (heap[index] < heap[parent]) {
                int temp = heap[index];
                heap[index] = heap[parent];
                heap[parent] = temp;
                index = parent;
            } else {
                break;
            }
        }
    }
    private void heapifyDown(int index) {
         while (index <= size) {
            int left = 2 * index;       // left child
            int right = (2 * index) + 1; // right child
            int smallest = index;

            // check if left child is smaller
            if (left <= size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            // check if right child is even smaller
            if (right <= size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != index) {
                // swap
                int temp = heap[index];
                heap[index] = heap[smallest];
                heap[smallest] = temp;
                index = smallest;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }
}