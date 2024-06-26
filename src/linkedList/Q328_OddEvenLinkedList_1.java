package linkedList;



public class Q328_OddEvenLinkedList_1 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	class Solution {
	    public ListNode oddEvenList(ListNode head) {
	        if(head==null) return head;
	        ListNode evenHead= head.next;
	        ListNode odd= head, even = evenHead;
	        while(even!=null&&even.next!=null){
	            odd.next=even.next;
	            odd=odd.next;
	            even.next=odd.next;
	            even=even.next;
	        }
	        odd.next=evenHead;
	        return head;
	    }
	}
}
