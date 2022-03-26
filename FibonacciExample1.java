class FibonacciExample1
{
	public static void main(String [] aras)
	{
		int n = 0,n1=1,n2,count = 12;
		System.out.println(n + " " + n1);
		
		for(int i=2;i<count;i++)
		{
			n2 = n + n1;
			System.out.print(" "+n2);
			n=n1;
			n1 = n2;
		}
	
	}
}