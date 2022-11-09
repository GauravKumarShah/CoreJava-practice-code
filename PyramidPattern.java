import java.util.Scanner;
public class PyramidPattern
{
	public static void main(String []atgs)
	{	
	
	// i for rows and j for columns
	// row denotes the number of rows you want to print
	
	int i, j, row;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your Number for Pyramid?");
	row = scan.nextInt();
	//Outer loop work for rows
	
	for(i=0;i<row;i++)
	{
	
	// Inner loop work for space 
	for(j=row-i;j>1;j--)
	{
	
	// prints space between two stars
	System.out.print(" ");
	}
	for(j=0;j<=i;j++)
	{
	
	//prints star
	System.out.print("* ");
	}
	// Throws the cursor in a new line after printing each line
	System.out.println();
	}
}
}