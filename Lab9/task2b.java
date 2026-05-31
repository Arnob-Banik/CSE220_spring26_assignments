public class task2b {
    public static int maxEdgeWeightList(GraphList adjList, int vertices){
      int maxVertex = -1;
      int maxSum = Integer.MIN_VALUE;
      Node [] array = adjList.getAdjArrList();
      for (int i = 0; i < array.length; i++) {
        int sum = 0;
        Node temp = array[i];
        while (temp != null) {
            sum += temp.weight;
            temp = temp.next;
        }
        if (sum > maxSum) {
            maxSum = sum;
            maxVertex = i;
        }
      }
      System.out.println("The sum is: "+maxSum);
       System.out.print("Vertex that has maximum edge weight(in List): ");
        return maxVertex;
     }
}
