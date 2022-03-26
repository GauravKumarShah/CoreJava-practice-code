import java.io.*;
class Java
{
	public static void main(String[] a) throws Exception
	{
	FileOutputStream fout = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\example.txt");
	String s = "welcome beast";
	byte b[] = s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("okk");
	}
}
		