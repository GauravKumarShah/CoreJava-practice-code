import java.util.*;
class PalindromeExample
{
	public static void main(String [] args)
	{
	Scanner s = new Scanner(System.in);
	int remainder, sum = 0, temp;
	System.out.println("Enter the Number for check");
	int n = s.nextInt(); // it is the number variable to be checked for palindrome.
	
	temp = n;
		while(n >0)
		{
		remainder = n % 10; // getting remainder
		sum = (sum * 10) +remainder;
		n = n/10;
		}
		if(temp == sum)  {
		System.out.println("palindrome number");
		}
		else{
		System.out.println("not palindrome");
		}
}
	
	
}