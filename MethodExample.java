class MethodExample
{
public static void main(String[]args)
{
MethodExample d = new MethodExample();
d.show();

}
void show()
{
this.print();
System.out.println("The show is called");
}
void print()
{
System.out.println("The print is called");
}
}