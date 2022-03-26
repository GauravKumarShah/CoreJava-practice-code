
// Consider the following code snippet.

public class J
{
	public static void main(String []ags)
	{
		try
		{
		int a = 0;
		int b = 15/a;
		}
		catch(Throwable b)
		{
		System.out.println("Exception");	
		}
		catch(ArithmeticException e)
		{
		System.out.println("Throw Arithmetic Exception");
		}
	}
}	

// After executing the preceding code, Randy found that the code does not execute. Analyze the code and identify the statement or block that a responsible for the error.
	
// The catch(ArithmeticException a) block.