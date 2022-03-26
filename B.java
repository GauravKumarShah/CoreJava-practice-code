import java.util.*;
import java.text.*;
class B
{
	public static void main(String []args)
	{
	Double d = new Double(100000);
	Locale l = new Locale("de","DE");
	NumberFormat currency =NumberFormat.getCurrencyInstance(l);
	System.out.println(currency.format(d));
	}
}