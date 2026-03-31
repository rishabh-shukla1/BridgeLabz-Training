package list;

public class FindNthElement {
	
	 static class Node {
	        String data;
	        Node next;

	        Node(String data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public static void main(String[] args) {

	        // Create linked list manually
	        Node head = new Node("A");
	        head.next = new Node("B");
	        head.next.next = new Node("C");
	        head.next.next.next = new Node("D");
	        head.next.next.next.next = new Node("E");

	        // Print list
	        Node temp = head;
	        System.out.print("Linked List: ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");

	        int n = 2;  

	        
	        Node fast = head;
	        Node slow = head;

	        
	        for (int i = 0; i < n; i++) {
	            fast = fast.next;
	        }

	        
	        while (fast != null) {
	            fast = fast.next;
	            slow = slow.next;
	        }

	     
	        System.out.println("Nth element from end: " + slow.data);
	    }

}
