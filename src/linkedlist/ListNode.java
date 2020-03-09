package linkedlist;

//Each node has and item and a reference to next node in list.
public class ListNode {

    int item;
    ListNode next;

    public ListNode(int item, ListNode next) {
        this.item = item;
        this.next = next;
    }

    public ListNode(int item) {
        this(item, null);
    }
    //advantages over array lists:
    //1-inserting item int middle of linked list takes Constant time if you have references to previous node
    //2-moreover, list can key growing until memory runs out.
    //3-Insert a new item after "this".

    public void insertAfter(int item) {
        next = new ListNode(item, next);
    }


    //disadvantages:
    //Finding the n th item of a linked list takes time proportional to n.n->length of list.
    //(contant-time on array lists.)


    public ListNode nth(int position) {
        if (position == 1)
            return this;
        else if ((position < 1) || (next == null)) {
            return null;
        } else {
            //recursive method that walks throw list
            return next.nth(position-1);
        }
    }
}
