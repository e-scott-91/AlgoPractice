public class LinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;

        ListNode fast=head.next;
        ListNode slow=head;

        while(slow != fast){
            if (fast ==null|| fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
