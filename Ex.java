package Gaurav;
import java.util.*;
import java.io.*;
class Ex
{
	public static void main(String[] args) throws Exception
	{
	File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Gaurav");
	f.mkdir();
	System.out.println(f.exists());
	FileWriter fw=new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\Niit\\beast.ppt");    
	fw.write("My PPT is mery nice.");
	fw.close();    
 }
}  