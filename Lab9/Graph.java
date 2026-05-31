public class Graph {
      private int [][]adjMat;
    Graph(int size){
        adjMat = new int [size][size];  
    }
    public void addEdges(int s, int d, int v){
        adjMat[s][d] = v;
    }
    public void printArr(){
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int getadjMatsize(){
        return adjMat.length;
    }
    public int[][] getArray(){
        return adjMat;
    }
}
