package hashmap_stack;

import java.util.Scanner;

public class CircularTourProblem {
	
	public static void main(String args[]) {
		
		Scanner kb=new Scanner(System.in);
		int p[]= {4, 6, 7, 4};
		int d[]= {6, 5, 3, 5};
		int start=0;
		
		int t1=0;
		int t2=0;
		
		for(int i=0;i<p.length;i++)
		{
			t1+=(p[i]-d[i]);
			t2+=(p[i]-d[i]);
			
			if(t1<0)
			{
				start=i+1;
				t1=0;
			}
		}
		
	    if(t2<0)
	    {
	    	System.out.println("Not possible");
	    	System.exit(0);
	    }
	    
	    System.out.print("Start positon is :-"+start);
	    
		
		
		kb.close();
	}

}
