package linkedlist.singlelist;

public class SListNode {

    public Object items;
    public SListNode next;

    public SListNode(Object items, SListNode next) {
        this.items = items;
        this.next = next;
    }
    //2Problems with SListNodes
    //Insert new item at the beginning of the list  x=new SListNode("soap",x);
    //2-How do you represent an empty  list? x=null;
    //solution:seperate Slist class maintains head of list.


}
