// Ans. Line 3 causes the error. It should be replaced with the following code snippet 
//public void drawShape()
package circle;
interface Shape
	{	
	void drawShape();// Line 1
	}
class Circle1 implements Shape// Line 2
	{
	void drawShape()//Line 3
	{	
	System.out.println("Drawing circle");
	}
	public static void main(String []ars)
	{
	Shape c = new Circle();//Line 4
	c.drawShape();;
	}
}