class ObjectExample
{
	public static void main(String []aegs)
	{
	Object a[] = new Object[6];
	a[0]="Gaurav";
	a[1]='G';
	a[2]=100;
	a[3]=10.98;
	a[4]=198.87d;
	a[5]=true;
	for(Object o : a)
	{
	System.out.println(o);
	}
	}
}