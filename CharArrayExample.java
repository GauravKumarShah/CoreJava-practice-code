import java.io.*;  
class CharArrayExample
{  
  	public static void main(String[] ag) throws Exception 
	{  
    	char[] ary = { 'G', 'a', 'u', 'r', 'a', 'v', 's', 'h', 'a', 'h' };  
    	CharArrayReader reader = new CharArrayReader(ary);  
    	int i = 0;  
    		while ((i = reader.read()) != -1) 
		{  
      		char ch = (char) i;  
      		System.out.print(ch + " : ");  
      		System.out.println(i);  
    		}  
  	}  
}  