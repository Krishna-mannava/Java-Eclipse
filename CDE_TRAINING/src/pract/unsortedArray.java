package pract;

public class unsortedArray {

	public static void main(String[] args) 
	{
		int []a=new int[] {5,2,31,1,9,0,12,18,-1};
		int miny=2147483647,maxy=-2147483648;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<miny)
			{
					miny=a[i];
			}

			if(a[i]>maxy)
			{
					maxy=a[i];
			}
		
			
		}
		System.out.print("Max: "+String.valueOf(maxy)+"\tMin: "+String.valueOf(miny));

	}

}
