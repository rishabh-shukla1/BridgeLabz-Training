package hashmap_stack;

import java.util.*;
public class StockSpanProblem {
  
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
	    
	    Stack<Integer> s=new Stack<>();
	    int ans[]=new int[l];
	    ans[0]=1;
	    s.push(0);
	    
	    
	   for(int i=1;i<l;i++)
	   {
		   while(!s.isEmpty() && a[s.peek()]<=a[i]) {
			   s.pop();
		   }
		   if(s.isEmpty()) {
			   ans[i]=i+1;
		   }
		   else {
			   ans[i]=i-s.peek();
		   }
		   s.push(i);
	   }
	   
	   
	   for(int i=0;i<l;i++)
	   {
		   System.out.print(ans[i]+" ");
	   }
	   
	   kb.close();
	}

}
