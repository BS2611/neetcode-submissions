class ListNode {
    int val;
    ListNode next;

    // Constructor that sets 'next' to null by default
    public ListNode(int val) {
        this(val, null);
    }

    // Constructor that accepts both value and next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int i=0;
        while(curr!=null){
            if(i== index){
                return curr.val;
            }
            i++;
            curr =curr.next;

        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newVal = new ListNode(val);
        newVal.next= head.next;
        head.next = newVal;
        if(newVal.next==null){
            tail = newVal;
        }
        
    }

    public void insertTail(int val) {
        ListNode newVal = new ListNode(val);
        tail.next = newVal;
        tail = newVal;

    }

    public boolean remove(int index) {
        ListNode curr = this.head;
        int i=0;
        while(i<index && curr!=null){
            i++;
            curr =curr.next;
        }

        if(curr!=null && curr.next!=null){
            if(curr.next == this.tail){
            this.tail =curr;

            }
            curr.next= curr.next.next;
            return true;
        }
         return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = this.head.next;
        
        while(curr!=null){
            list.add(curr.val);
            curr =curr.next;

        }
        return list;

    }
}
