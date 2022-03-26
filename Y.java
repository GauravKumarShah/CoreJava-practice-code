import java.util.*;

public class Y
{
	public static void main(String []args)
	{
	ArrayDeque<String> obj = new ArrayDeque<String>();	
	obj.add("Car");
	obj.add(new String("Bus"));
	obj.add("Car");
	System.out.println(obj);
	}
}