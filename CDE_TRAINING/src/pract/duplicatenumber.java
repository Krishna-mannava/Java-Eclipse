package pract;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class duplicatenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int key=a[i];
			if(countMap.containsKey(key))
			{
				int count = countMap.get(key);
                count++;
                countMap.put(key, count);
			}
			else
			{
				countMap.put(key, 1);
			}
		}
		for(Entry<Integer, Integer> val : countMap.entrySet())
        {
            if(val.getValue()>1)
            {
            	System.out.print(val.getKey()+"\t");
            }
        }
	}

}
