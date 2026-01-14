package hashmap_stack;

import java.util.*;

public class TargetSum {
     
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
	    
	    
	    
	    HashSet<Integer> h=new HashSet<>();
	    
	    for(int i=0;i<l;i++)
	    {
	    	int f=target-a[i];
	    	if(h.contains(f)) {
	    		
	    		System.out.println("Pair is "+a[i]+" and "+f);
	    		
	    		System.exit(0);
	    	}
	    	
	    	h.add(a[i]);
	    }
	    
	    kb.close();
	    
	    
		
	}

}
