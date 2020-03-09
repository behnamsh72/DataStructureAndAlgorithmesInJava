import linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7, new ListNode(0, new ListNode(6)));
        l1.next.insertAfter(3);


        System.out.println(l1.nth(4).item);

    }
}
