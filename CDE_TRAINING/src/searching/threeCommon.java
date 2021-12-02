package searching;

import java.util.Scanner;

public class threeCommon {
	public static boolean linearSearch(int a[], int m,int key)
	 {
		for(int i=0;i<m;i++)
		{
			if(a[i]==key)
			{
				return true;
			}
		}
		return false;
	 }
    
 
		 
   
	public static void main(String[] args) 
	{
		 int m,n,o;
		 Scanner sc=new Scanner(System.in);
		 m=sc.nextInt();
		 n=sc.nextInt();
		 o=sc.nextInt();
		 int []arr=new int[m];
		 int []brr=new int[n];
		 int []crr=new int[o];
		 for(int i=0;i<m;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 for(int i=0;i<n;i++)
		 {
			 brr[i]=sc.nextInt();
		 }
		 for(int i=0;i<o;i++)
		 {
			 crr[i]=sc.nextInt();
		 }
		 for(int i=0;i<m;i++)
		 {
			
			 if(linearSearch(brr,n,arr[i])&&linearSearch(crr,o,arr[i]))
			 {
				 
				 System.out.print(String.valueOf(arr[i])+"\t");
			 }

        }
	}
	}
	
