public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD

    public static void pairJoin(DNode dh1, DNode dh2) {
        if(dh1.next==null)return;
        DNode temp1 = dh1.next;

        do{
            DNode temp= dh2.next;
            dh2.next = temp.next;
            DNode s2 = temp.next;
            if(s2 != null){
             s2.prev = dh2;
            }
            DNode s1= temp1.next;
            temp1.next= temp;
            temp.next = s2;
            s2.prev = temp;
            temp.prev = temp1;
            temp1 = s1;
        } while(temp1!=dh1);
        System.out.println("my output");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
                System.out.println("here");



    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
