import java.util.*;
import java.io.*;  
class PrintWriterExample1
{
	public static void main(String[] args) throws Exception 
	{	
	Scanner scan = new Scanner(System.in);  
               	PrintWriter writer = new PrintWriter(System.err);    
      	writer.write("I like the power");        
 	writer.flush();  
      	writer.close();  
	}
}