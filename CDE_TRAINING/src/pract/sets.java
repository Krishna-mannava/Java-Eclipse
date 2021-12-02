package pract;

import java.util.*;


public class sets {

	public static void intersect(List<Integer>a , List<Integer>b)
	{
		System.out.println("Intersection of A and B is");
		for(int i=0;i<a.size();i++)
		{
			if(b.contains(a.get(i)))
			{
				System.out.print(String.valueOf(a.get(i))+"\t");
			}
		}
	}
	public static void main(String[] args) 
	{
		List<Integer> a= new ArrayList<Integer>();
		List<Integer> b= new ArrayList<Integer>();
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array A size: ");
		m=sc.nextInt();
		System.out.println("\nEnter array B size:");
		n=sc.nextInt();
		System.out.println("Enter A array elements:");
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println("Enter B array elements:");
		for(int i=0;i<n;i++)
		{
			b.add(sc.nextInt());
		}
		intersect(a,b);
		
		

	}

}
