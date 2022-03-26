class ExampleThis 
{
public static void main(String[]args)
{
ExampleThis d = new ExampleThis();
d.show();
}
void show()
{
this.print();
System.out.println("This is done ...1");
}
int print()
{
this.go();
System.out.println("The work is done .. 2");
return 0;
}
int go()
{
System.out.println("This is not done .. 3");
return 0;
}}