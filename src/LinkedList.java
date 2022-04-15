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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return list1;
        } else if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        ListNode newHead = new ListNode();
        ListNode curr = newHead;
        while(list1 != null && list2 != null) {
            if(list1.val >= list2.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        if(list1 != null) {
            curr.next = list1;
        }
        if(list2 != null) {
            curr.next = list2;
        }
        return newHead.next;
    }
}
