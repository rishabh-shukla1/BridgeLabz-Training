package hashmap_stack;

import java.util.*;

public class SubarraysWithZero {
	
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
	    
	   
	    HashMap<Integer,List<Integer>> h=new HashMap<>();
	    
	     h.put(0,new ArrayList<>());
	     h.get(0).add(-1);
	     
	     int sum=0;
	     
	     for(int i=0;i<l;i++)
	     {
	    	 sum=sum+a[i];
	    	 
	    	 if(h.containsKey(sum))
	    	 {
	    		 List<Integer> t=h.get(sum);
	    		 for(int j:t) {
	    			 
	    			 System.out.println("Subarray from index "+ (j+1)+" to "+i);
	    		 }
	    	 }
	    	 
	    	 h.putIfAbsent(sum,new ArrayList<>());
	    	 h.get(sum).add(i);
	    }
	     
	     kb.close();
	    
		
		
	}

}
