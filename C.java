import java.util.*;
import java.util.regex.*;

class C
{
	public static void main(String []args)
	{
	Pattern p = Pattern.compile("sam++");
	Matcher m = p.matcher("sam");
	boolean b = m.matches();
	System.out.println(b);
	
	}
}