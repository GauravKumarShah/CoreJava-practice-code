import java.io.*;
class DemoPath
	{
	public static void main(String []args)
	{	
	Path s = Paths.get("E:/file.txt");
	Path s1 = Paths.get("E:/newtest.txt");
	try{
	Files.copy(s,s1);	
	}
	catch(IOException a)
	{
	System.out.println(a);
	}
	}
}