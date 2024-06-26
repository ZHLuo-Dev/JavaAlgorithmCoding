package linkedList;



public class Q203_RemoveLinkedListElements_2 {
	//O(n), O(1)
	class Solution {
		 public class ListNode {
			      int val;
			      ListNode next;
			      ListNode() {}
			      ListNode(int val) { this.val = val; }
			      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
			  }
	    public ListNode removeElements(ListNode head, int val) {
	        ListNode dummyHead = new ListNode(0);
	        dummyHead.next = head;
	        ListNode temp = dummyHead;
	        while (temp.next != null) {
	            if (temp.next.val == val) {
	                temp.next = temp.next.next;
	            } else {
	                temp = temp.next;
	            }
	        }
	        return dummyHead.next;
	    }
	}
}
