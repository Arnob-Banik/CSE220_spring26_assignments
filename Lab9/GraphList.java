
public class GraphList {
     private Node [] arr;
    GraphList(int s){
        arr = new Node [s];
    }
    public void addEdge(int s, int d, int w){
        Node NN = new Node(d,w);
            if(arr[s]==null) {
                arr[s] = NN;
            }
            else{
                Node temp = arr[s];
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next = NN;
            }
        }
        public void printGlist(){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i+" : ");
                if(arr[i]!=null){
                    Node temp = arr[i];
                    while(temp!=null){
                       
                        System.out.print(temp.dest+ " ");
                        temp= temp.next;
                    }
                }
                System.out.println();
            }
        }
        public int getLengthList(){
            return arr.length;
        }
        public Node [] getAdjArrList(){
            return arr;
        }
}
