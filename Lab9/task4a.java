public class task4a {
      public static void convertToUndirectedMatrix(Graph directedGraph) {
       int[][] arr = directedGraph.getArray();
       int n = arr.length;
        for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {  
        if (arr[i][j] != 0 || arr[j][i] != 0) {
         int weight;
         if (arr[i][j] != 0) {
          weight = arr[i][j];
        } 
        else {
        weight = arr[j][i];
        }
        arr[i][j] = weight;
        arr[j][i] = weight;
        }
        }
    }
      }


}
