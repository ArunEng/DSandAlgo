package medium.linkedlist;

public class InsertintoaCyclicSortedList {

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
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(4);
		head.next.next.next = head;
		int val = 2;
		System.out.println(insert(head, val));
	}

	static ListNode insert(ListNode head, int val) {
		ListNode i = new ListNode(val);
		if (head == null) {
			i.next = i;
			return i;
		}
		ListNode curr = head, next = curr.next;
		while (curr != head) {
			if (curr.val <= val && next.val >= val) {
				break;
			}
			if (curr.val > next.val && (curr.val <= val || next.val >= val)) {
				break;
			}
			curr = next;
			next = next.next;
		}
		curr.next = new ListNode(val, next);
		return head;
	}

}
