package pract;

public class pairSum {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		int num=8,n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if((a[i]+a[j])==num)
				{
					System.out.println("("+String.valueOf(a[i])+","+String.valueOf(a[j])+")");
					
				}
			}
		}

	}

}
