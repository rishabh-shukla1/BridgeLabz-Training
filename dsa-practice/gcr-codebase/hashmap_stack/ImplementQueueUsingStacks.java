package hashmap_stack;
import java.util.*;

public class ImplementQueueUsingStacks {
	
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	public void enqueue(int x) {
		
		s1.add(x);
		System.out.println("Inserted:-"+x);
		
	}
	
	public int dequeue() {
		
		if(s1.isEmpty() && s2.isEmpty())
		{
			System.out.println("Empty Queue");
		}
		
		if(s2.isEmpty())
		{
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			
		}
		
		return s2.pop();
		
	}

	
	public static void main( String args[]) 
	{
		ImplementQueueUsingStacks q = new ImplementQueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued:-" + q.dequeue());
        System.out.println("Dequeued:-" + q.dequeue());
		
	
	}

}
