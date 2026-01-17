package stringbuffer_stringbuilder_linear_binarysearch;

public class CompareStringBufferAndStringBuilder 
{
	
	public static void main(String args[]) {
		
		int n=1000_000;
		String ss="hello";
		
		StringBuffer sb=new StringBuffer();
		
		long start=System.currentTimeMillis();
		
		for(int i=0;i<n;i++)
		{
			sb.append(ss);
		}
		
		long endtime=System.currentTimeMillis();
		
		long time1=endtime-start;
		
		
		start=System.currentTimeMillis();
		
		StringBuilder s=new StringBuilder();
		
		for(int i=0;i<n;i++)
		{
			s.append(ss);
		}
		
		endtime=System.currentTimeMillis();
		long time2=endtime-start;
		
		System.out.println("StringBuffer Time : " + time1);
        System.out.println("StringBuilder Time: " + time2);

		
		
		
		
	}

}
