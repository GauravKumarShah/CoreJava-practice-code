
package Gaurav;
import java.util.*;
class Calculator
{
	public static void main (String[]args)
	{ 
	Scanner n1 = new Scanner (System.in);
	
	do{

	System.out.println ("\nEnter your choice:\n+<--------addition\n-<---------subtract\n*<---------multiply\n/<---------divide");
	char choice=n1.next().charAt(0);
	System.out.println ("Enter 1st Number:  ");
	int num=n1.nextInt ();
	System.out.println("Enter 2nd Number:  ");
	int num1=n1.nextInt ();
	
 		switch (choice)
		{
			case '+':
			System.out.println(num+num1);
			break;
			case '-':
			System.out.println(num-num1);
			break;
			case '*':
			System.out.println(num*num1);
			break;
			case '/':
			System.out.println(num/num1);
			break;
			default:
			System.out.println("invalid");
}
System.out.println("Do u want to continue");
String s= n1.nextLine();

}
while(s.equals(Y)||s.equals(y));
}
}		