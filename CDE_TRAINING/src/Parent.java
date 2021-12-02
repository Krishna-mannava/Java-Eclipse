
class GParent 
{
	int i=20;
GParent()
{
	
	System.out.println("gp1");
	
}
void a()
{
	System.out.println("gp2");
}
}
public class Parent extends GParent
{
	int i=22;
	Parent()
	{
		System.out.println("p1");
	}
	void a()
	{
		System.out.println("p2");
	}	
	{
		this.a();  
		super.a();
	}
	
	public static void main(String args[])
	{
		int i=24;
		GParent p=new Parent();
		System.out.println(p.i);
		p.a();
	}

}
