package Gaurav;
class A
{
void show(int a )
{
System.out.println(a);
}
void show()
{
System.out.println("Show called ...");
}
}
class AssociationExample
{
public static void main(String[]aefs)
{
A a = new A();
a.show();
a.show(1000);
}
}