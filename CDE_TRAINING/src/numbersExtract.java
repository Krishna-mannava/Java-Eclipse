import java.io.*;
public class numbersExtract {

	public static void main(String[] args) throws IOException
	{
		File fi1=new File("C:\\Users\\venka\\Desktop\\CDE_Tasks\\Java\\Old.txt");
		File fi2=new File("C:\\Users\\venka\\Desktop\\CDE_Tasks\\Java\\New.txt");
		FileWriter fw=new FileWriter(fi2);
		FileReader fr=new FileReader(fi1);
		int ch;
		while((ch=fr.read())!=-1)
		{
		   if(48<=ch &&ch<=57)
		   {
			   System.out.println((char)ch);
			   fw.append((char)ch);
			   
		   }
			
		}
		fw.close();

	}

}
