/**
Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]

Constraints:
    The number of nodes in the list is in the range [0, 500].
    -100 <= Node.val <= 100
    0 <= k <= 2 * 10^9
*/

package medium.linkedlist;

public class RotateList {

	static public class ListNode {
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
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		int k = 4;
		System.out.println(rotateRight(head, k));
	}

	static ListNode rotateRight(ListNode head, int k) {
		if(head == null || k == 0 || head.next == null) return head;
        ListNode tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        k = k%length;
        if(k == 0) return head;
        int n = length-k-1;
        ListNode curr = head;
        while(n>0){
            curr = curr.next;
            n--;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;
        return newHead;
	}

}
