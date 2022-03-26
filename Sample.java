import java.util.*;

class Sample
{
	public void showMenu()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("MEnu");
	System.out.println("1 Play");
	System.out.println("2 Instruction");
	System.out.println("3 Quit");
	System.out.println("nChoose the option");
	int opt = scan.nextint();
	assertion(opt>0 && opt<4);
	System.out.println("Please enter a value in the range of 1-3");
	switch(opt)
	{
	case 1:
	break;
	case 2:
	break;
	case 3:
	System.exit(0);
	break;
	}
	}
		public static void main(String []ars)
		{
		}
}
