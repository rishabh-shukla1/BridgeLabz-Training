package sorting;

public class BubbleSort {
	public static void main(String args[]) {
		
		int a[] ={43,34,35,5,32,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
		
	}

}
