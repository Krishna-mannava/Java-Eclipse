package pract;

public class containNum {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5};
		int n=6,flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{   flag=1;
				System.out.println("yes");
				break;
			}
		}
		if(flag==0)
		{   
			System.out.println("No");//we can use linear search or binary search
		}
	

	}

}
