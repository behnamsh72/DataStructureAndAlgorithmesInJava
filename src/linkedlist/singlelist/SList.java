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


    @Override
    public boolean equals(Object o) {
        if (o instanceof SList) {
            if (this == o) return true;
            if (size != ((SList) o).size) {
                return false;
            }
            SListNode n1 = head;
            SListNode n2 = ((SList) o).head;
            while (n1 != null) {
                if (!n1.item.equals(n2.item)) {
                    return false;
                }
                n1 = n1.next;
                n2 = n2.next;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
