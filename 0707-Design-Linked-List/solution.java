class MyLinkedList {
    ListNode head;
    

    public MyLinkedList() {
        head = null;
        
    }
    
    public int get(int index) {
        ListNode current = head;
        int count = 0;
        while(current != null){
            if(index == count){
                return current.val;
            }
            count++;
            current = current.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        
        head = newNode;
    }
    
    public void addAtTail(int val) {

        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        
    }
    

public void addAtIndex(int index, int val) {
    if (index < 0) {
        return;
    }

    int count = 0;
    ListNode newNode = new ListNode(val);
    ListNode current = head;

    if (index == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }

    if (current == null) {
        return;
    }

    while (current.next != null) {
        if (index == count + 1) {
            newNode.next = current.next;
            current.next = newNode;
            return;
        }

        count++;
        current = current.next;
    }

    // Insert at the end if index equals the list length
    if (index == count + 1) {
        current.next = newNode;
    }
}
    
    public void deleteAtIndex(int index) {
        int count = 0;
        ListNode current = head;
        if(head==null){
            return;
        }
        if(index==0){
            head = head.next;
            return;
        }
        while(current!= null && current.next!= null){
            if(index==count+1){
                current.next = current.next.next;
                return;
            }
            count++;
            current = current.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */