import java.util.Arrays;
public class task4 {
    public static int[] time (int[]arr, int k){
        MinHeap heap = new MinHeap(k);
        for(int i=0;i<k;i++){
            heap.insert(0);
        }
        for( int i=0; i<arr.length; i++){
            int min = heap.extractMin();
            heap.insert(min+arr[i]);
        }
        int a[] = new int[k];
         for(int i = 0 ; i<k; i++){
            a[i]=heap.extractMin();
         }
         return a;


    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 7, 1, 6};
        int k = 4;
        int [] a = time(arr, k);
        System.err.println(Arrays.toString(a));
        
    }
    
}
