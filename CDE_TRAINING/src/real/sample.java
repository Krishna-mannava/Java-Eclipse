package real;

public class sample {
	static int fib(int n)
    {
	
	    int f[] = new int[n+2];
	    int i;

	    f[0] = 0;
	    f[1] = 1;
	     
	    for (i = 2; i <= n; i++)
	    {
	    
	       
	        f[i] = f[i-1] + f[i-2];
	    }
	      
	    return f[n];
    }
	static void palindrome(int arr[], int n)
    {
        
        int flag = 0;
 
   
        for (int i = 0; i <= n / 2 && n != 0; i++) {
 
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                break;
            }
        }
 
        if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
    static void sum(int a[] )
    
	public static void main(String[] args) {
		
		int n = 9;
	    System.out.println(fib(n));
	    int arr[] = { 1, 2, 3, 2, 1 };
        int n2 = arr.length;
 
        palindrome(arr, n2);
	}

}
