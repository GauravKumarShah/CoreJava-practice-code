import java.util.*;
class Calculator
{
public static void main(String[]gaurav)
{String decision=null;
Scanner scan = new Scanner(System.in);
do
{
System.out.println("\t\tEnter your choice :\n+ <----- Addition\n- <----- Subtract\n*<----- Mullitply\n/<----- Divide");
char choice = scan.next().charAt(0);
System.out.println("Enter first number");
int num = scan.nextInt();
System.out.println("Enter 2nd number");
int num1 = scan.nextInt();

switch (choice)
{
case '+' :
  System.out.println(num + num1);
  break;
case '-' :
  System.out.println(num - num1);
  break;
case '*' :
  System.out.println(num * num1);
  break;
case '/' :
  System.out.println(num / num1);
  break;
default :
 System.out.println("Invalid Choice");
 break;
}
System.out.println("Do you want to continue ? ");
decision = scan.next();
}while(decision.equals("yes")||decision.equals("YES")||decision.equals("y")||decision.equals("Y"));
}
}