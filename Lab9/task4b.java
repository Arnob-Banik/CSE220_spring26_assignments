public class task4b {
    public static void convertToUndirectedList(GraphList g) {

    Node[] adj = g.getAdjArrList();

    for (int i = 0; i < adj.length; i++) {
         Node temp  = adj[i];
        while (temp != null) {
            int v = temp.dest ;
            int w = temp.weight ;

        boolean exists = false;
        Node check = adj[v];

        while (check!= null) {
           if (check.dest== i) {
            exists = true;
            break;

        }

        check= check.next;

        }

        if (!exists) {
           g.addEdge(v, i, w);

        }

        temp= temp.next;

        }

      }

    }
}
