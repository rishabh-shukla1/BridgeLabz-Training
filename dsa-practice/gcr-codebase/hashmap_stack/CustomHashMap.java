package hashmap_stack;

public class CustomHashMap {
	
	class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
	
	  private int size = 10;          
	   private Node bucket[];

	    CustomHashMap() {
	        bucket = new Node[size];
	    }
	    
	    private int getIndex(int key) {
	        return key % size;
	    }
	    
	    
	    public void put(int key, int value) {

	        int index = getIndex(key);

	        Node head = bucket[index];

	      
	        Node temp = head;
	        while (temp != null) {
	            if (temp.key == key) {
	                temp.value = value;
	                return;
	            }
	            temp = temp.next;
	        }

	        // Insert new node at beginning
	        Node newNode = new Node(key, value);
	        newNode.next = head;
	        bucket[index] = newNode;
	    }

	    public int get(int key) {

	        int index = getIndex(key);
	        Node temp = bucket[index];

	        while (temp != null) {
	            if (temp.key == key) {
	                return temp.value;
	            }
	            temp = temp.next;
	        }

	        return -1;   
	    }

	    // REMOVE operation
	    public void remove(int key) {

	        int index = getIndex(key);
	        Node temp = bucket[index];
	        Node prev = null;

	        while (temp != null) {

	            if (temp.key == key) {

	                if (prev == null) {
	                    bucket[index] = temp.next;
	                } else {
	                    prev.next = temp.next;
	                }
	                return;
	            }

	            prev = temp;
	            temp = temp.next;
	        }

	    }
	    
	    public static void main(String args[]) {

	    	CustomHashMap map = new CustomHashMap();

	        map.put(1, 100);
	        map.put(2, 200);
	        map.put(12, 1200);   

	        System.out.println(map.get(1));   
	        System.out.println(map.get(2));   
	        System.out.println(map.get(12));  

	        map.remove(2);

	        System.out.println(map.get(2));  
	    }
}
