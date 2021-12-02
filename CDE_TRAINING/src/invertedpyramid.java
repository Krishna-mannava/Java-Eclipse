import java.util.Scanner;

public class invertedpyramid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j+1)<=n/2)
					System.out.print(" ");
				else
					System.out.print("* ");    //rectangular block
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i-j)>0)
					System.out.print(" ");   //inverted pyramid
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				if((i-j)<0)
					System.out.print(" ");        //pyramid
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j+1)<=n/2)
					System.out.print(" ");
				else
					System.out.print("* ");    //rectangular block
			}
			System.out.println();
		}

	}

}
