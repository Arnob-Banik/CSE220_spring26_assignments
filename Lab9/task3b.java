public class task3b {
    public static void maxOutDegreeList(GraphList directedList) {
        Node[] adj = directedList.getAdjArrList();
        int maxDegree = -1;
        int maxVertex = -1;

        for (int i = 0; i < adj.length; i++) {
            int count= 0;
            Node temp  = adj[i];
            while ( temp != null) {
                count++;
                temp = temp.next;
            }

            if ( count > maxDegree ) {
                maxDegree = count;
                maxVertex = i;
            }
        }
        System.out.println("Vertex with maximum out-degree (Adj List): "+ maxVertex + ", degree=" + maxDegree);
    }
}
