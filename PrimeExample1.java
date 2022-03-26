// By the help of Method
class PrimeExample1
{
	static void checkPrime(int n)
	{
		int m = 0, flag = 0;
		m = n/2;
		if(n == 0 || n== 1)
		{
			System.out.println(n+ " is not a prime number");	
			System.out.println("  ");
		}
		else{
		for(int i = 2; i <= m;i++)
		{
			if(n%i == 0)
			{
				System.out.println(n+ " is not a prime number");
				System.out.println("  ");		
				flag = 1;
				break;
			}
		}
			if(flag == 0)
			{
				System.out.println( n+ " is a prime number");
				System.out.println("  ");
			}
			}
	}
	public static void main(String[] args)
	{
	checkPrime(1);
	checkPrime(999);
	checkPrime(8765);
	checkPrime(76597);
	checkPrime(8754678);
	checkPrime(876);
	}
	
}
