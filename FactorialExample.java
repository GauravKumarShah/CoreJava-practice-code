import java.util.Scanner;
class FactorialExample
{

	public static void main(String [] args)
	{
	Scanner s = new Scanner(System.in);
	double i, fact= 1;
	System.out.println("Enter your Number whom you want to know the factorial?");
	int number = s.nextInt();
	for (i = 1;i <=number;i++)
	{
	fact = fact*i;
	}
	System.out.println("Factorial of " + number + " is :" + fact);
	
	}	
}