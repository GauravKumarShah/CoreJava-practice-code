import java.util.Scanner;
class FactorialExample1
{
	public static void main(String [] args)
	{
	Scanner s = new Scanner(System.in);
	Integer i, fact = 1;
	System.out.println("Enter the factorial number");
	int number = s.nextInt();
	fact = factorial(number);
	System.out.println("Factorial of " +number+ " is : " +fact);
	}
	static int factorial(int n)
	{
	if(n == 0)
		return 1;
	else
		return(n*factorial(n-1));
	}
}