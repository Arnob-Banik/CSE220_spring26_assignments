public class AssignmentTask7 {

    public static void rangeMove(DNode dh, int start, int end) {
        if(dh.next==dh)return;
        DNode tail = dh.prev;
        DNode tailC = tail;
        DNode temp = dh.next;

        do{

            Integer x = (Integer) temp.elem;
            if(x>start && x<end){
            DNode P = temp.prev;
            DNode S = temp.next;
            P.next = S ;
            S.prev = P;
            tail.next =temp;
            temp.next = dh;
            dh.prev = temp;
            temp.prev = tail;
            tail = temp;
            temp = P;
            }
        temp = temp.next;
        } while (temp!=tailC);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
       LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
