import java.util.Scanner;
public class RectangleArea
{
	public static void main(String [] a)
	{
	Scanner aa = new Scanner(System.in);
	System.out.println("Enter you height: ");
	int height = aa.nextInt();
	System.out.println("Enter your width:");
	int width = aa.nextInt();
	int area = height * width;
	System.out.println("Area of rectangle is : " + area);

	}
} 