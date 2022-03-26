class Return
{
void show(int  a )
{
System.out.println(a);

}
int print(int b)
{
System.out.println(b);
return 0;

}
String nischal(int c)
{
System.out.println(c);
return " ";
}
public static void main(String[]arr)
{
Return obj = new Return();
obj.show(50);
System.out.println(obj.print(80));
System.out.println(obj.nischal(100));
}} 