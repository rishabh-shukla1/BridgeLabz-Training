package sorting;

public class QucikSort {
	
	public static void main(String args[]) {
		
		int a[] ={43,34,35,5,32,3};
				
		sort(a,0,a.length-1);

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	public static void sort(int a[],int i, int j)
	{
		if(i>=j)
		{
			return;
		}
		
		int p=Partition(a,i,j);
		
		sort(a,i,p-1);
		sort(a,p+1,j);
		
	}
	
	public static int Partition(int a[], int i ,int j)
	{
		
		int  item=a[j];
		int  k=i;
		
		for(int f=i;f<=j;f++)
		{
			if(a[f]<item) 
			{
				int t=a[f];
				a[f]=a[k];
				a[k]=t;
				k++;
				
			}
		}
		
		int t=a[j];
		a[j]=a[k];
		a[k]=t;
		return k;
	}

}
