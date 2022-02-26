public class AddingNumbersList {

    public ListNode addTwoNumbers() {
        ListNode listOne = new ListNode(1);
        ListNode listTwo = new ListNode(1, listOne);
        ListNode listThree = new ListNode(2, listTwo);
        String numberFormed = formNumber(listThree, "");
        int result = Integer.parseInt(numberFormed) + Integer.parseInt(numberFormed);
        System.out.println(result);
        return listThree;
    }

    public String formNumber(ListNode linkedList, String result) {
        result += linkedList.val;
        if (linkedList.next != null) {
            result = formNumber(linkedList.next, result);
        }
        return result;
    }


}
