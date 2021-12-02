package db;

public class singleton {


	private static singleton single_instance = null;

	public String s;
	private singleton()
	{
		s = "Hello I am a string part of Singleton class";
	}

	public static singleton getInstance()
	{
		if (single_instance == null)
			single_instance = new singleton();

		return single_instance;
	}
}
