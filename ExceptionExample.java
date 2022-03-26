class ExceptionExample
{
public static void main(String []ags)
{
	try
	{
	System.out.println(2/0);
	System.out.println(0/0);
	System.out.println(1/0);
	}
	catch (Exception e)
	{
	System.out.println(e);
	}
}
}