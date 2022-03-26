import java.util.*;

class Name
{
	public static void main(String []rgs)
	{
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Enter your Name.");
		name= scan.nextLine();
			if(name=="Preeti" || name=="Esha" || name=="Rani"|| name=="Meera")
			{
			name= name+" Kumari";
			System.out.println("Your name is "+name);
			}
			else
			{
			name = name +" Kumar";
			System.out.println("Your name is "+name);
			}
	}
}