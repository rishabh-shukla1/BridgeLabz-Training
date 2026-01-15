package sorting;

public class MergeSort {
	
	public static void main(String arge[]) {
		
		int a[] ={43,34,35,5,32,3};
		
		a=divide(a,0,a.length-1);

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

		
		
	}
	
	public static int[] divide(int a[],int i, int j) {
		
		if(i>=j)
		{
			int b[]=new int[1];
			b[0]=a[i];
			return b;
		}
		
		int mid=(i+j)/2;
		
		int left[]=divide(a,i,mid);
		int right[]=divide(a,mid+1,j);
		
		return Merge(left,right);
	}
	
	public static int[] Merge(int a[], int b[])
	{
		
		int c[]=new int[a.length+b.length];
	    int i=0;
	    int j=0;
	    int k=0;
	    
	    while(i<a.length && j<b.length) {
	    	
	    	if(a[i]<b[j])
	    	{
	    		c[k++]=a[i++];
	    	}
	    	else {
	    		c[k++]=b[j++];
	    	}
	    }
	    
	    while(i<a.length)
	    {
	    	c[k++]=a[i++];
	    }
	    while(j<b.length)
	    {
	    	c[k++]=b[j++];
	    }
	    
	    
	    return c;
		
	}
}
