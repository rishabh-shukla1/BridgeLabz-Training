package hashmap_stack;

import java.util.*;

public class SlidingWindowMaximum 
{
	public static void main(String args[])
	{
		
		Scanner kb=new Scanner(System.in);
	    System.out.println("Enter the Length :-");
	    
	    int l=kb.nextInt();
	    // Array defined
	    int a[]=new int[l];
	    
	    //User Input
	    System.out.println("Enter the Number:-");
	    for(int i=0;i<l;i++)
	    {
	    	a[i]=kb.nextInt();
	    }
        
	    System.out.println("Enter window size");
	    int k=kb.nextInt();
	    
	    Deque<Integer> d=new ArrayDeque<>();
	    
	    for(int i=0;i<l;i++)
	    {
	    	
	    	//Maintaining the window size
	    	while(!d.isEmpty() && d.peekFirst()<=i-k) {
	    		d.pollFirst();
	    	}
	    	
	    	while(!d.isEmpty() && a[d.peekLast()]<=a[i]) {
	    		
	    		d.pollLast();
	    		
	    	}
	    	
	    	d.offer(i);
	    	
	    	if(i>=k-1)
	    	{
	    		System.out.print(a[d.peekFirst()]+",");
	    	}
	    	
	    	
	    	
	    }
	    
	    kb.close();
	    
	}
}
