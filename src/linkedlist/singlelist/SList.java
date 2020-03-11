package linkedlist.singlelist;

//solution of a empty node list
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    public void insertFront(Object item) {
        head = new SListNode(item, head);
        size++;
    }

    public void deleteFront() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }
    //Remove from end of the list is not easy
}
