import java.io.*;
class FilterOutputStreamExample
{  
    	public static void main(String[] args) throws IOException 
	{  
        	File data = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Gaurav.txt");  
        	FileOutputStream file = new FileOutputStream(data);  
        	FilterOutputStream filter = new FilterOutputStream(file);  
        	String s="Welcome to javaTpoint.";      
        	byte b[]=s.getBytes();      
        	filter.write(b);     
        	filter.flush();  
        	filter.close();  
        	file.close();  
        	System.out.println("Success...");  
    	}  
}  