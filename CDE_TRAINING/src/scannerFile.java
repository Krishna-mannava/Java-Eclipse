import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class scannerFile {

	public static void main(String[] args) throws Exception
	{
		File file=new File("C:\\Users\\venka\\Desktop\\CDE_Tasks\\Java\\Old.txt");
		File f2=new File("../no.txt");
		FileWriter fw=new FileWriter(f2);
		Scanner sc = new Scanner(file);
	    while (sc.hasNextLine()) 
	    {   String str=sc.nextLine();
	    	for (int i = 0; i < str.length(); i++) 
	    	{
	    		if(Character.isDigit(str.charAt(i)))
	    		{
	    			fw.append(str.charAt(i));
	    		}
	    	}
	    }
	    fw.close();

	}

}
