package linkedlist;
//solution of a empty node list
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        head=null;
        size=0;
    }
    public void insertFront(Object item){
        head=new SListNode(item,head);
        size++;
    }
}
