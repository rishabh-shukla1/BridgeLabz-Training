package list;
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Reverse {
		
	public static void reverseList(List<Integer> list) 
	{
	        int left = 0;
	        int right = list.size() - 1;

	        while (left < right) 
	        {
	            int temp = list.get(left);
	            list.set(left, list.get(right));
	            list.set(right, temp);

	            left++;
	            right--;
	        }
	    }
	
	
	 public static ListNode reverseLinkedList(ListNode head) {
	        ListNode prev = null;

	        while (head != null) {
	            ListNode curr = head.next;
	            head.next = prev;
	            prev = head;
	            head = curr;
	        }

	        return prev;
	    }
	 
	 public static void main(String[] args) {

	        // Java List example
	        List<Integer> list = new ArrayList<>(
	                Arrays.asList(1, 2, 3, 4, 5)
	        );

	        System.out.println("Original Java List: " + list);
	        reverseList(list);
	        System.out.println("Reversed Java List: " + list);

	        System.out.println();

	       
	        ListNode head = new ListNode(10);
	        head.next = new ListNode(20);
	        head.next.next = new ListNode(30);
	        head.next.next.next = new ListNode(40);

	        System.out.println("Original Custom Linked List:");
	        printListNode(head);

	        head = reverseLinkedList(head);

	        System.out.println("Reversed Custom Linked List:");
	        printListNode(head);
	    }
	 
	 public static void printListNode(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + " -> ");
	            head = head.next;
	        }
	        System.out.println("null");
	    }



}
