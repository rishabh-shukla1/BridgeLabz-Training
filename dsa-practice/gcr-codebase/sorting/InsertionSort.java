package sorting;

public class InsertionSort {
	
	public static void main(String args[]) {
		
		int a[] ={43,34,35,5,32,3};
		
		for(int i=1;i<a.length;i++)
		{
			
		  int j=i-1;
		  int key=a[i];
		  
		  while(j>=0 && a[j]>key)
		  {
			
			  a[j+1]=a[j];
			  j--;
			  
		  }
		  a[j+1]=key;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
