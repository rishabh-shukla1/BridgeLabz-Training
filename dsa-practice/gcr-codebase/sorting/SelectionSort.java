package sorting;

public class SelectionSort {
	
public static void main(String args[]) {
		
		int a[] ={43,34,35,5,32,3};
		
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int t=a[min];
			a[min]=a[i];
			a[i]=t;
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
