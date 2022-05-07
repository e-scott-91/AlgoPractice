package linkedList;

public class ReOrderList {

    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head, curr = head;
        //finding the middle node to reverse
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr1 = reverse(slow.next);
        slow.next = null;
        boolean flag = false;
        //made two listnode independently and moving the pointer alternately
        while (curr != null && curr1 != null) {
            if (!flag) {
                ListNode next = curr.next;
                curr.next = curr1;
                curr = next;
                flag = true;
            } else {
                ListNode next = curr1.next;
                curr1.next = curr;
                curr1 = next;
                flag = false;
            }
        }

    }

    //reversing the linkedlist portion after middle
    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
