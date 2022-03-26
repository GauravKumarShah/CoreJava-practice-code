package Gaurav;
import java.util.*;
class InputExample
{
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	String [] longest = new String[10];
        System.out.println("Enter the Names");    
	
	for(int i = 0; i<10; i++)
	longest[i]=scan.nextLine();
	System.out.println("Entered Names");    
            for(String ss: longest)
		System.out.println(ss);
}
}
