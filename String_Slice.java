public class String_Slice{
	
	public static void main(String []args)	
	{
		String str = "ABCDEFGH";
		
		String tem  = "";
		for ( int i = 0;i<= str.length()-1; i++)
		{
			tem = str.charAt(i) + tem;
			
		}
System.out.print(tem);
	}
}