package user_portal;
import java.sql.*;
import java.util.Scanner;
public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","201729");
		Statement stat=c.createStatement();
		ResultSet rs=stat.executeQuery("select * from login");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		//stat.executeUpdate("update login set pass = 172930 where username=\"krishna\"");
		Scanner sc=new Scanner(System.in);
		String l=sc.nextLine();
		PreparedStatement ps=c.prepareStatement("update login set pass = 17210 where username=?");
		ps.setString(1, l);
		ps.executeUpdate();
		
	}   

}
