package Gaurav;
class A
{
static int count=0;
static void m()
{
count++;
if(count<=5)
	{
	System.out.println("no."+ count);
	m();
	}}
public static void main(String []aegs)
{
m();
}
}