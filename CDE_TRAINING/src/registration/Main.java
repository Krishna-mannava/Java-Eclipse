package registration;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Model m=new Model();
		while(true)
		{
			System.out.println("Choose one of the following:\n1.Login\n2.SignUp\n3.Exit.");
			int ch = sc.nextInt();
		switch(ch)
			{   
				case 1: 
					
				System.out.println("Enter Login user name:");
				//sc.nextLine();
				System.out.println("Enter Login Password:");
				 //sc.nextLine();
				break;
				case 2: System.out.println("Enter your details for SignUp");
				System.out.println("Enter your username");
				//sc.nextLine();
				System.out.println("Enter your password");
				//sc.nextLine();
				System.out.println("Enter your course name");
				//sc.nextLine();
				System.out.println("Enter your city name");
				//sc.nextLine();
				break;
				case 3:
					System.out.println("You've chosen to Exit");
					return ;
				default:
					System.out.println("Choose your option wisely");
				
			}
		}
	}

}



while(rs.next())
{
	if(username.equals(rs.getString(1))&&password.equals(rs.getString(2)))
	{
		return True;
	}
	
}
return false;
}
