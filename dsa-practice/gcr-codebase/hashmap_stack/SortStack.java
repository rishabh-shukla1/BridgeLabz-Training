package hashmap_stack;
import java.util.*;

 

public class SortStack {
	
	
		public static void sortstack(Stack<Integer>s) {
			
			if(s.isEmpty()) {
				return ;
			}
			
			int x=s.pop();
			
			sortstack(s);
			insert(s,x);
			
		}
	
	
		public static void insert(Stack<Integer>s,int x) 
		{
			if(s.isEmpty() || s.peek()<=x) {
				s.push(x);
				return ;
				
			}
			
			int t=s.pop();
			
			insert(s,x);
			
			s.push(t);
			
		
		}
	
		public static void main(String args[]) {
			
		
		Stack<Integer> s = new Stack<>();
	
	    s.push(3);
	    s.push(1);
	    s.push(4);
	    s.push(2);
	
	    System.out.println("Before Sorting: " + s);
	
	    sortstack(s);
	
	    System.out.println("After Sorting: " + s);
		}

}
