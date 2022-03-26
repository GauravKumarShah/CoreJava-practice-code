class ThisConstructorExample
{
public static void main(String []args)
{
new ThisConstructorExample();
}
ThisConstructorExample()
{
this(10000);
}
ThisConstructorExample(int a )
{
System.out.println(a);
}}
