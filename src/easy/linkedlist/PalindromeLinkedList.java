/**
Given the head of a singly linked list, return true if it is a palindrome.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

Constraints:
    The number of nodes in the list is in the range [1, 10^5].
    0 <= Node.val <= 9

Follow up: Could you do it in O(n) time and O(1) space?
*/

package easy.linkedlist;

public class PalindromeLinkedList {
	
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
		System.out.println(isPalindrome(head));
	}
	
	static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        //1.get middle
        //2.reverse from middle
        //3.compare!
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast !=null && fast.next == null){
                slow = slow.next;
            }
        }
        ListNode rev = reverseListIterative(slow);
        while(rev != null && head != null){
            if(rev.val != head.val) return false;
            rev = rev.next;
            head = head.next;
        }
        return true;
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

}
