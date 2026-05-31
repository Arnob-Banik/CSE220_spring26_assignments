public class Task2a {
    public static int maxEdgeWeightMatrix(Graph adj, int vertices){
        int maxSum = Integer.MIN_VALUE;
        int maxVertex = -1;
        int [][] arr = adj.getArray();
        for (int i = 0; i < vertices; i++) {
            int sum =0;
            for (int j = 0; j < vertices; j++) {
             sum+= arr[i][j];
            }
            if(sum>maxSum) {
                maxSum = sum;
                maxVertex = i;
            }
            
        }
        System.out.println("The sum is: "+maxSum);
        System.out.print("Vertex that has maximum edge weight(in Matrix): ");
        return maxVertex;

    }
}
