class Parent
{
	public void show()
	{
	System.out.println("Parent class method");
	}
}

class Child extends Parent
{
	public void show()
	{
	System.out.println("Child class method");
	}
		public static void main(String []args)
		{
		Child c = new Child();
		Parent p = new Child();
		c.show();
		p.show();
		}
}