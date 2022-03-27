/**
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

Constraints:
    The number of nodes in the list is sz.
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz
    
Follow up: Could you do this in one pass?
*/


package medium.linkedlist;

public class RemoveNthNodeFromEndofList {

	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
			next = null;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null; int n = 0;
		System.out.println(removeNthFromEnd(head, n));
	}
	
	static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        while(n>0 && right != null){
            right = right.next;
            n--;
        }
        
        while(right != null){
            left = left.next;
            right = right.next;
        }
        
        left.next = left.next.next;
        
        return dummy.next;
    }

}
