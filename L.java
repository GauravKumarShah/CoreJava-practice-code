class L
{
private int a;
	public void showValue()
	{
	System.out.println(a);
	}
	protected void Display()
	{
	System.out.println("This is my example");
	}
}
class M extends L
{
	
	public static void main(String []arr)
	{
	M m = new M();
	m.showValue();
	m.a=5;
	
	}
}