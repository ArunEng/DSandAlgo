/**
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both list1 and list2 are sorted in non-decreasing order.
*/

package easy.linkedlist;

public class MergeTwoSortedLists {
	
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
		ListNode list1 = new ListNode(2), list2 = new ListNode(1);
		list1.next = new ListNode(5);
		list1.next.next = new ListNode(10);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(8);
		
		System.out.println(mergeTwoLists(list1, list2));
	}
	
	static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode res = new ListNode();
		ListNode head = res;
		while (list1 != null && list2 != null) {
			if (list1.val >= list2.val) {
				res.next = list2;
				list2 = list2.next;
			} else {
				res.next = list1;
				list1 = list1.next;
			}
            res = res.next;
		}
		if (list1 != null) {
			res.next = list1;
		}
		if (list2 != null) {
			res.next = list2;
		}
		return head.next;
    }

}
