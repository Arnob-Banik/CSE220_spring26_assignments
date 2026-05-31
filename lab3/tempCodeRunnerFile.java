 public static void sumOddAppend(Node dh) {
        // TO DO
        if(dh.next==dh) return;
        Node temp = dh.next;
        Node pred = dh;
        int sum = 0;

        while (temp!=dh){
            if((Integer)temp.elem%2!=0){
                sum+= (Integer)temp.elem;
                pred.next = temp.next;
            }
            else{
                pred = pred.next;
            }
            temp=temp.next;
        }
        Node New = new Node(sum);
        pred.next = New;
        New.next =dh;
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(dh);

    }