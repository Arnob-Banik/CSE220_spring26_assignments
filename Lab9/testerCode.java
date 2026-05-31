



public class testerCode {
        public static void main(String[] args){
        Graph adj = new Graph (7);
        //Adjacency Matrix
        adj.addEdges(0,1,4);
        adj.addEdges(1,0,4);
        adj.addEdges(0,2,2);
        adj.addEdges(2,0,2);
        adj.addEdges(0,3,7);
        adj.addEdges(3,0,7);
        adj.addEdges(0,4,6);
        adj.addEdges(4,0,6);
        adj.addEdges(0,5,5);
        adj.addEdges(5,0,5);
        adj.addEdges(1,2,3);
        adj.addEdges(2,1,3);
        adj.addEdges(1,3,8);
        adj.addEdges(3,1,8);
        adj.addEdges(1,6,2);
        adj.addEdges(6,1,2);
        adj.addEdges(2,3,1);
        adj.addEdges(3,2,1);
        adj.addEdges(2,4,9);
        adj.addEdges(4,2,9);
        adj.addEdges(2,6,4);
        adj.addEdges(6,2,4);
        adj.addEdges(3,4,2);
        adj.addEdges(4,3,2);
        adj.addEdges(3,5,6);
        adj.addEdges(5,3,6);
        adj.addEdges(4,5,7);
        adj.addEdges(5,4,7);
        adj.addEdges(4,6,5);
        adj.addEdges(6,4,5);
        adj.addEdges(5,6,3);
        adj.addEdges(6,5,3);

        System.out.println("Adjacency Matrix(undirected graph):");
        adj.printArr();
        //TASK 2a
        int length = adj.getadjMatsize();
        int maxVertexWeight = Task2a.maxEdgeWeightMatrix(adj,length);
        System.out.print(maxVertexWeight+"\n");



        //Task 3a
        Graph directedMatrix = new Graph (7);
        directedMatrix.addEdges(0,1,10);
        directedMatrix.addEdges(0,2,3);
        directedMatrix.addEdges(0,5,6);
        directedMatrix.addEdges(1,3,12);
        directedMatrix.addEdges(1,6,4);
        directedMatrix.addEdges(2,1,2);
        directedMatrix.addEdges(2,3,8);
        directedMatrix.addEdges(2,4,7);
        directedMatrix.addEdges(3,4,5);
        directedMatrix.addEdges(3,5,11);
        directedMatrix.addEdges(4,5,9);
        directedMatrix.addEdges(4,6,6);
        directedMatrix.addEdges(5,6,13);
         System.out.println("Adjacency Matrix(directed graph):");
        directedMatrix.printArr();
        //Task 2a
        int lengthmat = directedMatrix.getadjMatsize();
        int maxVertexW = Task2a.maxEdgeWeightMatrix(directedMatrix,lengthmat);
        System.out.print(maxVertexW+"\n");
    
        //Task 3a
        task3a.maxOutDegreeMatrix(directedMatrix);
      
        
        //Task 4a 
        task4a.convertToUndirectedMatrix(directedMatrix);
        System.out.println("Converted undirected graph: ");
        directedMatrix.printArr();
     



        //Adjacency List
        GraphList adjList = new GraphList(7);
        adjList.addEdge(0, 1, 4);
        adjList.addEdge(1, 0, 4);
        adjList.addEdge(0, 2, 2);
        adjList.addEdge(2, 0, 2);
        adjList.addEdge(0, 3, 7);
        adjList.addEdge(3, 0, 7);
        adjList.addEdge(0, 4, 6);
        adjList.addEdge(4, 0, 6);
        adjList.addEdge(0, 5, 5);
        adjList.addEdge(5, 0, 5);
        adjList.addEdge(1, 2, 3);
        adjList.addEdge(2, 1, 3);
        adjList.addEdge(1, 3, 8);
        adjList.addEdge(3, 1, 8);
        adjList.addEdge(1, 6, 2);
        adjList.addEdge(6, 1, 2);
        adjList.addEdge(2, 3, 1);
        adjList.addEdge(3, 2, 1);
        adjList.addEdge(2, 4, 9);
        adjList.addEdge(4, 2, 9);
        adjList.addEdge(2, 6, 4);
        adjList.addEdge(6, 2, 4);
        adjList.addEdge(3, 4, 2);
        adjList.addEdge(4, 3, 2);
        adjList.addEdge(3, 5, 6);
        adjList.addEdge(5, 3, 6);
        adjList.addEdge(4, 5, 7);
        adjList.addEdge(5, 4, 7);
        adjList.addEdge(4, 6, 5);
        adjList.addEdge(6, 4, 5);
        adjList.addEdge(5, 6, 3);
        adjList.addEdge(6, 5, 3);
        System.out.println("Adjacency List(undirected graph):");
        adjList.printGlist();
        //Task2b
        int lengthlist = adjList.getLengthList();
        int maxVertex = task2b.maxEdgeWeightList(adjList,lengthlist);
        System.out.print(maxVertex+"\n");

        //Task 3b 


        GraphList directedList = new GraphList(7);
        directedList.addEdge(0, 1, 12);
        directedList.addEdge(0, 2, 5);
        directedList.addEdge(0, 3, 18);
        directedList.addEdge(0, 4, 7);
        directedList.addEdge(0, 5, 10);
        directedList.addEdge(1, 2, 6);
        directedList.addEdge(1, 3, 15);
        directedList.addEdge(1, 6, 9);
        directedList.addEdge(2, 3, 4);
        directedList.addEdge(2, 4, 11);
        directedList.addEdge(2, 6, 8);
        directedList.addEdge(3, 4, 3);
        directedList.addEdge(3, 5, 14);
        directedList.addEdge(4, 5, 13);
        directedList.addEdge(4, 6, 7);
        directedList.addEdge(5, 6, 16);
        System.out.println("Adjacency List(directed graph):");
        directedList.printGlist();

        //task3b(1)
        task3b.maxOutDegreeList(directedList);
        //task 3b(2)
        int length2 = directedList.getLengthList();
        int maxVertex2 = task2b.maxEdgeWeightList(directedList,length2);
        System.out.print(maxVertex2+"\n");

        //Task 4b 
        task4b.convertToUndirectedList(directedList);
        System.out.println("Converted to undirected adjacency list: ");
        directedList.printGlist();
    }
}


