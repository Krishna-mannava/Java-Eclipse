package pract;
public class missingnumber{

	public static void main(String[] args) 
	{
		
		  int arr [] = {1, 10, 5, 9, 2, 7, 3, 0, 4, 6};
		  int n = arr.length; 
		  int sum = n*(n+1)/2; 
		  int emptySpace = 0;
		  int missingNo = 0;
		  int result = 0;
		   
		  for (int i = 0; i < arr.length; i++) 
		  {
		   if(arr[i] == 0)
		   {
		    emptySpace = i; 
		   }
		    
		   else
		   {
		    result += arr[i]; 
		   }
		  }
		   
		  
		  missingNo = sum - result;
		     
		  System.out.println("The Missing No is "+missingNo+" at the index "+emptySpace);
		 }
		
}

	
