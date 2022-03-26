import java.io.*;
public class Demo
	{
	public static void main(String []args)
	{
	boolean bool;
	long pos;
	String s = "Hello Everybody";
	try(FileWriter fos = new FileWriter("D:\\file.txt"))
	{
	fos.write(s);
	}catch(Exception e)
	{
	System.out.println(e);
	}
	}
}