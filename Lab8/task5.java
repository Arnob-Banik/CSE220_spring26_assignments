import java.util.Arrays;
public class task5 {
    public static void kMax(int[] arr, int k){
        MaxHeap heap = new MaxHeap(arr.length);
        for(int i=0;i<arr.length;i++){
        heap.insert(arr[i]);

    }
    int [] A = new int[k];
    for(int i=0;i<k;i++){
        if(heap.isEmpty())break;
        A[i]=heap.extractMax();
    }
    System.err.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int arr[] = {4, 10, 2, 8, 6, 7};
        int k = 8;
        kMax(arr, k);
    }
}
