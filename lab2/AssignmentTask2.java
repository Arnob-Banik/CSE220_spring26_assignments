// AssignmentTask2: Organize Books
import java.util.Arrays;
public class AssignmentTask2{
    
    public static Node getTail(Node head){
        Node temp = head;
        while (temp!=null){
            if(temp.next==null)return temp;
            temp=temp.next;
        }
        return null;
    }

    public static Node getNode(Node head, int i){
        Node temp = head;
        int count = 0;

        while (temp!=null){
            if(count == i) return temp;
            temp=temp.next;
            count++;
        }
        return null;
    }
    
    public static Node organizeBooks(Node head, Integer[] popularity) {
        Node tail =getTail(head);
        Node preTail = tail;
        int idx=0;
        int size = popularity.length;
        int count = 0;
        while(count<size){
         int max = popularity[0];

        for(int i=0;i<size;i++){
            if(popularity[i]>max) {
                idx = i;
                max = popularity[i];
            }
        }
        Node find = getNode(head, idx);
        Node newNode = new Node(find.elem);
        tail.next = newNode;
        tail = newNode;
        count++;
        popularity[idx]=-1;
        idx = 0;
    }
    Node x = head;
    while(x!=preTail){
        head=head.next;
        x=x.next;
    }
         head=head.next;
        return head;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[]{"Dune", "IT", "Coraline", "Inferno", "Twlight"});
        Integer[] arr = { 8, 10, 5, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");
        
        System.out.println("Your Output");
        books = organizeBooks( books, arr );
        LinkedList.printLL(books);

       
        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[]{"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
        Integer[] arr2 = {7, 9, 9, 6, 7};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);


        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[]{"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
        Integer[] arr3 = {5, 8, 8, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
