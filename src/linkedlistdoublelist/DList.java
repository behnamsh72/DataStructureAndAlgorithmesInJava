package linkedlistdoublelist;

import java.util.concurrent.ConcurrentLinkedQueue;

public class DList {

    private DListNode  head;
    private DListNode tail;

    //now insert & delete items at both ends in constant running time .

    //Removes the tail node(at least 2 items in DList.

    public void removeTail(){
        tail.previous.next=null;
        tail=tail.previous;
    }


    /*
    DList invariants with sentinel:
    1-For  any Dlist d, d.head!=null. because we have a sentinel node
    2-For any DListNode x, x.next!=null.
    3-For ANY DListNode x, x.prev!=null
    4-For ANy DListNode x, if x.next == y, then y.prev==x ke in ghzie do shartist
    5-For ANy DListNode x, if x.prev==y,  then y.next=x
    6-A DList's size variable is # of DListNode, NOT COUNTING sentinel.
    7- in an empty DList sentinel previous and next point to itself
     */

}
