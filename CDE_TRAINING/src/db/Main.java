package db;


import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Model obj=new Model();
        while(true)
        {
            System.out.println("Choose one of the following:\n1.Login\n2.SignUp\n3.Display\n4.Exit");
            int ch = sc.nextInt();
        switch(ch)
            {   
                case 1: 
                System.out.println("Enter Login user name:");
                obj.setUserName(sc.next());
                System.out.println("Enter Login Password:");
                obj.setPwd(sc.next());
                obj.retrieve();
                break;
                
                case 2: System.out.println("Enter your details for SignUp");
                System.out.println("Enter your username");
                obj.setUserName(sc.next());
                System.out.println("Enter your password");
                obj.setPwd(sc.next());
                System.out.println("Enter your course name");
                sc.nextLine();
                obj.setCourse(sc.nextLine());
                System.out.println("Enter your city name");
                obj.setCity(sc.nextLine());
                obj.insert();
                
                break;
                case 3:
                obj.display();
                
                break;
                
                case 4:
                    System.out.println("Goodbye, see you soon");
                    sc.close();
                    return ;
                default:
                    System.out.println("Choose your option wisely");
                
            }
        }
        
    }

}
