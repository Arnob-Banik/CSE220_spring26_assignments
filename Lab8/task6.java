import java.util.Arrays;

public class task6 {
     // ---- Task Scheduler method ----
    public static String[] taskScheduler(String[] taskNames, int[] priorities) {
        cMaxHeap heap = new cMaxHeap(taskNames.length);

        for (int i = 0; i < taskNames.length; i++) {
            heap.insert(new Task(taskNames[i], priorities[i]));
        }

        // 3. Extract max  into result array
        String[] result = new String[taskNames.length];
        int i = 0;
        while (!heap.isEmpty()) {
            result[i] = heap.extractMax().name;
            i++;
        }

        return result;
    }


     public static void main(String[] args) {

        String[] taskNames   = {"Email", "Meeting", "Code Review", "Lunch", "Debug"};
        int[]    priorities  = {2,        5,          3,             1,       4};

    String[] result = task6.taskScheduler(taskNames, priorities);

        System.out.println(Arrays.toString(result));
    }
}
class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}
 class cMaxHeap {

    private Task[] heap;
    private int size;
    private int capacity;

    public cMaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Task[capacity + 1]; 
        this.size = 0;
    }

    public void insert(Task task) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        size++;
        heap[size] = task;
        heapifyUp(size);
    }

    public Task extractMax() {
        if (isEmpty()) return null;
        Task max = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        heapifyDown(1);
        return max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void heapifyUp(int index) {
        while (index > 1) {
            int parent = index / 2;
            if (heap[index].priority > heap[parent].priority) { // compare by priority
                Task temp = heap[index];
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

            if (left <= size && heap[left].priority > heap[largest].priority) {
                largest = left;
            }
            if (right <= size && heap[right].priority > heap[largest].priority) {
                largest = right;
            }

            if (largest != index) {
                Task temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }

   
}