/**
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []

Constraints:
    The number of nodes in the list is the range [0, 5000].
    -5000 <= Node.val <= 5000

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

 */

package easy.linkedlist;

public class ReverseLinkedList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null;
		System.out.println(reverseListIterative(head));
	}
	
	static ListNode reverseListIterative(ListNode head) {
        ListNode start = head;
        while(start != null && start.next!= null){
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = head;
            head = temp;
        }
        return head;
    }
	
	static ListNode reverseListRecursive(ListNode head) {
		if(head != null && head.next != null) {
        	ListNode temp = reverseListRecursive(head.next);
        	head.next.next = head;
            head.next = null;
            return temp;
        }
        return head;
    }

}
