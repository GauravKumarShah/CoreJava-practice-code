class FibonacciExample2
{
	static int n = 0, n1= 1, n2= 0;
	public static void main (String [] args)	
	{
		int count = 10;
		System.out.print(n + " " + n1);
		printFibonacci(count- 2);			
	}
	static void printFibonacci (int count)
	{
		if(count > 0)
		{
			n2= n+n1;
			n = n1;
			n1 = n2;
					
			System.out.print(" " + n2);
			printFibonacci (count -1);
		}
	}
}