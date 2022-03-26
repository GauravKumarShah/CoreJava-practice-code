abstract class A
{
	A()	
	{
		
	System.out.println("A Constructor");
	}
}
class B extends A
{
	B()
	{
	this;
	System.out.println("B Constructor");
	
	}
	public static void main(String []args)
	{
	new B();	
	}
}