import java.io.*;

class K
{
	public static void main(String []ars) throws IOException
	{
	try(BufferReader b = new BefferReader(new InputStreamReader(System.in)))
	{
	System.out.println("Enter  name");
	System.out.println("Hi"+ b.readLine());
	}
	}
}
	