class ConstructorExample
{
public static void main(String[]args)
{
new ConstructorExample();

}
ConstructorExample()
{
this("Gaurav");
System.out.println("The constructor is working");
}
ConstructorExample(int a)
{
System.out.println(a);
}
ConstructorExample(String name)
{
this(10);
System.out.println(name);
}


}