package leetcode;

public class Solution21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if ( l1 == null ) return l2;
        if ( l2 == null ) return l1;
        ListNode res = new ListNode(-1);
        ListNode prev = res;
        while ( l1 != null && l2 != null ) {
            if ( l1.val <= l2.val ) {
                prev.next = l1;
                l1 = l1.next;
            }
            else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if ( l1 == null ) {
            prev.next = l2;
        }
        else {
            prev.next = l1;
        }
        return res.next;
    }
}
