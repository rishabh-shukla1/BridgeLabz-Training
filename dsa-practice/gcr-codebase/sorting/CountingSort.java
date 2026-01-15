package sorting;

public class CountingSort {
	
	public static void main(String args[]) {
		
		int a[]= {12, 15, 11, 10, 14, 18, 13, 15, 11, 10, 16, 17, 14, 12, 18};
		
		
		int max=Find(a);
		
		
		int freq[]=new int[max+1];
		for(int i=0;i<a.length;i++)
		{
			freq[a[i]]++;
		
		}
		int ans[]=new int[a.length];
		
		for(int i=1;i<freq.length;i++)
		{
			freq[i]=freq[i-1]+freq[i];
		}
		
		for(int i=a.length-1;i>=0;i--)
		{
			int d=freq[a[i]];
			ans[d-1]=a[i];
			freq[a[i]]--;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(ans[i]+",");
		}
		
		
	}
	
	public static int Find(int a[]) {
		
		int max=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		return max;
	}

}
