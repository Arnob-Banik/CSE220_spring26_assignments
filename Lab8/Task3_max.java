import java.util.Arrays;
public class Task3_max {
    public static void main(String[] args) {
    
    MaxHeap heap = new MaxHeap(12);
    int [] arr = {1,9,3,0,2,5,7,8,6,4};
    for(int i=0;i<arr.length;i++){
        heap.insert(arr[i]);
        
    }
        int i=0;
        while(!heap.isEmpty()){
            arr[i]=heap.extractMax();
            i++;
        }
     System.out.println(Arrays.toString(arr));
    }
    
    
    } 

