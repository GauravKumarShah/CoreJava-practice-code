import java.util.*;

class PalindromeExample2
{
	public static void main(String [] args)
	{
	String original, reverse = "";//Objects of String class
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a string/number to check if it is a palindrome ");
	original = s.nextLine();
	int length = original.length();
		for (int i =length-1;i >=0; i--)
		{
		reverse= reverse + original.charAt(i);
			if(original.equals(reverse))
			{
			System.out.println( original + " Entered string/number is a palindrome");
			} 
			else{
			System.out.println(original + " Entered string/number isn't a palindrome");
		}}
	}
}