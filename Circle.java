// Ans. Compilation error at line 4
package circle;
interface A
	{
	void drawShape();
	{};
	}
	class Circle implements A
	{
	public void drawShape()
	{
	System.out.println("A circle");	
	}
	public static void main(String []args)
	{
	A a = new Circle();
	a.drawShape();
	}
	}	
	