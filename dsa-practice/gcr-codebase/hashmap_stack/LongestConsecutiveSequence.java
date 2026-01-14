package hashmap_stack;

import java.util.*;

public class LongestConsecutiveSequence {
	
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
	    HashSet<Integer> h=new HashSet<>();
	    
	    for(int i:a) {
	    	h.add(i);
	    }
	    
	    int i=0;
	    int count=0;
	    while(i<l) {
	    	
	        if(!h.contains(a[i]-1)) {
	        
	        
	        int t=a[i];
	        int f=0;
	        
	        while(h.contains(t++)) {
	        	
	        	f++;
	        }
	       
	        count=Math.max(count,f);
	        }
	        i++;
	    }
	    
	    
	    System.out.println(count);
	    kb.close();
	    
		
	}

}
