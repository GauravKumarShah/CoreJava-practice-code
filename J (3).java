import java.util.*;
class J
{
	public static void main(String []args)
	{
	Object i = new ArrayList().listIterator();
	System.out.print(i instanceof list);
	System.out.println(i instanceof Iterator);
	System.out.println(i instanceof listIterator);
	}
}