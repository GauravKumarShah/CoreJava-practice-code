import java.util.*;

class I
{
	int x= 30;
	void display()
	{
	final int y=50;
		class J
		{
			void msg(){
			int x=25;
			System.out.println("Value of x is"+x);
			System.out.println("Value of y is"+y);
			}
		}
	J j = new J();
	j.msg();
	}
	public static void main(String []args)
	{
	I i = new I();
	i.display();
	}
}