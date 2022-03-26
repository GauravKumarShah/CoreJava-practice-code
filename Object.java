class Object
{	
	void Gaurav()
	{
	System.out.println("Gaurav is on");}
	void display()
	{
	System.out.println("display called...") ;
	}
	void show()
	{
		System.out.println("show ...");
	}	
	public static void main(String[]args)
	{
	Object obj=new Object();
	obj.display();
	obj.show();
	obj.Gaurav();
	}
}