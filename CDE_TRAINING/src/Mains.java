import java.util.Scanner;

class DepositException extends Exception
{
	String message;
	DepositException(String s)
	{
		message=s;
	}
	public String toString()
	{
		return ("Deposit Exception Occured:"+ message);
	}
}
public class Mains {

	public static void provide(String name,int id,int salary)
	{
		try {
			
			if(salary<20000)
			{
				throw new DepositException("Normal");
			}
			else if(20000<salary && salary<50000)
			{
				
					throw new DepositException("Average");
				
			}
			else if(salary<50000)
			{
				throw new DepositException("High");
			}
			
		    else
		    {
			System.out.println("salary is:"+String.valueOf(salary));
		    }
		}
			catch(DepositException e)
			{
				System.out.println(e);
			}

	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String name;
		int id;
		int salary;
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter name:");
				name=sc.next();
				System.out.println("Enter ID:");
				id=sc.nextInt();
				System.out.println("Enter salary:");
				salary =sc.nextInt();
				provide(name,id,salary);
			}
		
		
	}

}
