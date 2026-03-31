package hashmap_stack;

import java.util.*;

public class TwoSum {
	
	public static void main(String args[]) {
		
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
	    System.out.println("Enter the target:-");
	    int target=kb.nextInt();
	    
	    
	    HashMap<Integer,Integer> h=new HashMap<>();
	    
	    for(int i=0;i<l;i++)
	    {
	    	int f=target-a[i];
	    	if(h.containsKey(f)) {
	    		
	    		System.out.println("Two indicies"+h.get(f)+" and "+i);
	    		
	    		System.exit(0);
	    	}
	    	
	    	h.putIfAbsent(a[i],i);
	    }
	    kb.close();
	}

}
