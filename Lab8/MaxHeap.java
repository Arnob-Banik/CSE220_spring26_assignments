public class MaxHeap {

    private Integer[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
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

    public Integer extractMax() {
        if(isEmpty()) return null;
        Integer max = heap[1];
        heap[1]= heap[size];
        heap[size]=null;
        size--;
        heapifyDown(1);
        return max;
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
            if (heap[index] > heap[parent]) {
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
        int left = 2 * index;
        int right = (2 * index) + 1;
        int largest = index;            

        if (left <= size && heap[left] > heap[largest]) {   
            largest = left;              
        }
        if (right <= size && heap[right] > heap[largest]) { 
            largest = right;            
        }

        if (largest != index) {         
            int temp = heap[index];
            heap[index] = heap[largest]; 
            heap[largest] = temp;        
            index = largest;             
        } else {
            break;
        }
    }
}

    public boolean isEmpty(){
        return size == 0;
    }
}