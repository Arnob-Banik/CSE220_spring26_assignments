public class task3a {
     public static void maxOutDegreeMatrix(Graph directedMatrix) {
        int maxDegree = -1;
        int maxVertex = -1;
        int [][] arr = directedMatrix.getArray();
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for(int j = 0; j < arr.length; j++) {
            if( arr[i][j] != 0){
                count++;
            }
           
        }

        if (count > maxDegree) {
            maxDegree = count;
            maxVertex = i;
        }

        }
        System.out.println("Vertex with maximum out-degree (Adj Matrix): " + maxVertex + ", degree=" + maxDegree);
}
}
