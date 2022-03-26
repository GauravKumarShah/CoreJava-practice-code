package Gaurav;
import java.util.*;
class Application 
{
	public static void main(String []args)
	{	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your ID");
	String id = scan.nextLine();
	System.out.println("Enter your strong password");
	String password = scan.nextLine();
		if(id.equals("Gaurav") || id.equals("gaurav") && password.equals("Gaurav@123"))
		{
		System.out.println("Login Successfully");
		}
			else
			{
			System.out.println("Login failed");
			}
	}
}