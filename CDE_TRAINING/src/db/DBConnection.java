package db;
import java.sql.*;
public class DBConnection {
	static Connection con;
	public static void getConnection()
	{
		try {
		//Class.forName("com.mysql.jdbc.Driver");  
		con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/authentication","gdv","Varma@123"); 
		}
		catch(Exception e)
		{
			System.out.print("Connection problem, please try again");
		}
		
	}
	public static void insert(String UserName, String Pwd, String Course, String City) {
		try {
	    if(UserName=="" || Pwd=="")
	    {
	    	System.out.print("User Name and Password can't be empty");
	    	return;
	    }
		PreparedStatement stmt=con.prepareStatement("insert into user_details values(?,?,?,?)");  

		stmt.setString(1,UserName); 
		stmt.setString(2,Pwd); 
		stmt.setString(3,Course); 
		stmt.setString(4,City); 
		try {
		stmt.executeUpdate(); 
		System.out.println("Your details are entered successfully");
		}
		catch(Exception e)
		{
			System.out.println("User already exists");
		   
		}
		}
		catch(Exception e)
		{
			System.out.print("Connection problem, please try again");
		}
		
	}
	
	public static void retrieve(String UserName, String Pwd) {
		
		try {
			PreparedStatement stmt=con.prepareStatement("select * from user_details where User_Name =? and pwd =?");  

			stmt.setString(1,UserName); 
			stmt.setString(2,Pwd);  
			  
			ResultSet r=stmt.executeQuery(); 

			try
			{
				r.next();
				System.out.println("Welcome "+r.getString(1));
			}
			catch(Exception e)
			{
				System.out.println("Sorry, Invalid User Name or Password");
			}
		
			}
			catch(Exception e)
			{
				System.out.print("Connection problem, please try again");
			}
	}
public static void display() {
		
		try {
			PreparedStatement stmt=con.prepareStatement("select * from user_details");   
			  
			ResultSet r=stmt.executeQuery(); 

			
				ResultSetMetaData rsmd = r.getMetaData();
				int columnsNumber = rsmd.getColumnCount();
				 for (int i = 1; i <= columnsNumber; i++) {
				        if (i > 1) System.out.print(", ");
				        System.out.print(rsmd.getColumnName(i));
				    }
				 System.out.println();
				 System.out.println();
				while (r.next()) {
				    for (int i = 1; i <= columnsNumber; i++) {
				        if (i > 1) System.out.print(", ");
				        String columnValue = r.getString(i);
				        System.out.print(columnValue);
				    }
				    System.out.println();
				    System.out.println();
				}
			
			}
			catch(Exception e)
			{
				System.out.print("Connection problem, please try again");
			}
	}

}
