class SuperExample extends Test

{
SuperExample()
{
System.out.println("SuperExample called");
}
public static void main(String []args)
{
new SuperExample();
}
}
class Test extends Check
{
Test()
{
System.out.println("Test called");
}

}
class Check
{
Check()
{
System.out.println("Check called");
}
}
