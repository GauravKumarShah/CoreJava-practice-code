class Temp
{
	byte b;
	int i;
	short s;
	long l;
	float f;
	double d;
	boolean bl;
	char c;
	static String collage_name = "WCTT9";
		void show()
		{
		int z=1000;
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Student_college_name");
		}
			public static void main(String []agrsa)
			{	
			Temp t = new Temp();
			t.show();
			System.out.println(Temp.collage_name);
			}
}