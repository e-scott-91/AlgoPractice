package linkedList;

public class RemoveKthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) {
            return null;
        }


        int size=0;
        ListNode curr = head;

        while(curr !=null) {
            size++;
            curr = curr.next;
        }

        // remove first from list if size == n
        if(size==n) {
            ListNode temp=head.next;
            return temp;
        }


        int indexToRemve = size-n+1;


        int i = 1;
        curr = head;
        ListNode prev = null;

        while(curr!=null && i < indexToRemve) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = curr.next;

        return head;

    }
}
