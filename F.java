import java.util.*;
	
class F
{
	public static void main(String []args)
	{
	TreeMap<Integer,String> t = new TreeMap<>();
	t.put(1,"North");
	t.put(2,"EAST");
	t.put(3,"SOUTH");
	t.put(4,"WAST");
	System.out.println(t.get(2));
	System.out.println(t);
	}
}