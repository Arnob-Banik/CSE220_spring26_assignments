// LabTask2: Word Decoder
public class LabTask2 {
      public static int indexCount(Node head){
        int count = 0;

            if (head==null){
                return 0;
            }
            else{
                Node temp = head;
                while(temp!=null){
                    count++;
                    temp=temp.next;
                }
            }
            return count;
            }

    public static Node indexAt(Node H, int idx){
        Node temp = H;
        for(int i =0; temp!=null; i++){
            if(i== idx){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    // No need to submit this task
    public static Node wordDecoder( Node head ){
        Node Head2 = null;
        int length = indexCount(head);
        if (length==0) return null;

        int count = 13 % length;
        for(int i = 0; i<length; i=i+count){
           
            if(i==0)continue;
             Node nodecopy = indexAt(head, i);
             Node temp = new Node(nodecopy.elem);
             temp.next = Head2;
            Head2 = temp;  
            }

            Node DH = new Node (null);
            DH.next = Head2;
            Head2=DH;
            return Head2;
        }
 
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
