public interface Check
{
	public static final MESSAGE ="keep out of reach from children";
	protected String status="On";
	void turnOn();
	public void turnOff();
}
public class A implements Check
{
	void turnOn()
	{
	System.out.println("My is what");
	}
	public void turnOff()
	{
	System.out.println("My is which");
	}
	public static void main(String []args)
	{
	}
}