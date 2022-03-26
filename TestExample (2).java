class TestExample
{
void t1()
{
System.out.println("t1 called ....");
}
}
class Check extends TestExample
{
void c1()
{
System.out.println("c1 called ....");
}
}
class Demo extends Check
{
void d1()
{
System.out.println("d1 called ....");
}
public static void main(String []args)
{
Demo d = new Demo();
d.t1(); d.c1();d.d1();
}
}